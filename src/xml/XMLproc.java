package xml;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.Vocabulary;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.Character;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

 

class XMLproc extends xmlParserBaseListener {
 String tag;

BufferedTokenStream allTokens;

  XMLproc( BufferedTokenStream allTokens ){
   this.allTokens = allTokens;
  }
//===================================================
  ParseTreeProperty<String> nem =
   new ParseTreeProperty<String>();

   //Annotate a tree node with its translation
  void setNem( ParseTree ctx, String s ){
   nem.put( ctx, s );
  }
   //Get a previously-saved annotation for a tree node
  String getNem( ParseTree ctx ) {
   return nem.get( ctx );
  }
//====================================================

@Override
 public void exitDocument(xmlParser.DocumentContext ctx) { 
  //setNem( ctx, ctx.getText() );

   StringBuilder buf = new StringBuilder();
    for (int i=0; i<ctx.getChildCount();i++){
     System.out.println( "exitDocument child: "+
            tagName( ctx.getChild(i)) );
     buf.append( nem.get(ctx.getChild(i) ) );
    }
    setNem( ctx, buf.toString() );
   
 }
 //Ignore prolog
public void exitProlog( xmlParser.PrologContext ctx){
  setNem( ctx, "" );
}
 //Ignore misc
public void exitMisc(xmlParser.MiscContext ctx){
  setNem( ctx, "" );
}
ParseTree grandParent( ParseTree ctx ){
 ParseTree parent = ctx.getParent();
 if (parent == null) return null;
 return parent.getParent();
}
String grandparentName( ParseTree ctx ){
  ParseTree gp = grandParent( ctx );
  if (gp == null) return null;
  return tagName( gp );
}
String parentName( ParseTree ctx ){
  ParseTree p = ctx.getParent();
  if (p == null) return "";
  return tagName( p );
}
String tagName( ParseTree ctx ){
 return tagName( ctx.getText() );
}

String tagName( String text ){
 int gt = text.indexOf( ">" );
 if (gt < 2 ) {
   // True if child is a terminal node
   //System.out.println( "tagName--LOGIC error--text: |"+text+"|" );
   //System.exit( 0 );
   return null;
 }
 return text.substring(1,gt);
}
@Override
 public void enterElement(xmlParser.ElementContext ctx) { 
  String name=tagName( ctx.getText() );
  if (name.equals( "math")) {
     setNem(ctx, ctx.getText() );
     return; 
  }
  System.out.println( "\n       -->ENTER Element: " +name);
  ParseTree gp = grandParent( ctx );
  if (gp != null){
     String old = gp.getText();
     System.out.println( "          text: "+ctx.getText()+
     " grandparent: "+old );
  }else{
  };
 //If the element is a token element save its name as annotation
 //then when the chardata checks its grandparent it will know
 //what kind of token element (if any) and replace the name with
 // proper text
 setNem(ctx, ctx.getText() );
}

 //Layout elements such as msup
@Override
 public void enterLayment(xmlParser.LaymentContext ctx) { 
 String name = tagName(ctx);
 //Thinking about informing content child how many
 // children this layout element has
 // or would the content names "base" and "script" be better"
 // of the content could ask?
 if (name.equals( "msup" )){
  setNem( ctx, "2" );
  return;
 }
 if (name.equals( "msubsup" )){
  setNem( ctx, "3" );
  return;
 }
 setNem( ctx, name );
}
@Override
 public void exitLayment(xmlParser.LaymentContext ctx) { 
 String name = tagName(ctx);
 System.out.println( "^^^exitLayment: "+name+
   " chilren cnt: "+ctx.getChildCount() );  

  //This is a HACK for now

    StringBuilder buf = new StringBuilder();
    buf.append( name.toUpperCase() );  //PREPENDS MSUP!
    for (int i=3; i<4;i++){
     String tmp = ctx.getChild( i).getText();
     buf.append( nem.get(ctx.getChild(i) ) );
    }
    System.out.println( name+" output: "+buf.toString() );
    setNem( ctx, buf.toString() );
    return;
 
                
}
@Override
 public void enterTokment(xmlParser.TokmentContext ctx) { 
 String name = tagName(ctx);
 setNem( ctx, name );
}
@Override
 public void exitTokment(xmlParser.TokmentContext ctx) { 
 String name = tagName(ctx);
 //if (name.equals( "mn" )){
  System.out.println( "\n  ***exitTokment--found this in tree: "+
                      getNem( ctx ) );
 //}
}
@Override
 public void enterRowment(xmlParser.RowmentContext ctx) { 
 String name = tagName(ctx);
 setNem( ctx, name );
}
@Override
 public void exitRowment(xmlParser.RowmentContext ctx) { 
 String name = tagName( ctx );
 int cnt = ctx.getChildCount();
 System.out.println( "EXITING ROWMENT Text: "+ctx.getText()+
    " no. of children: "+cnt );

    StringBuilder buf = new StringBuilder();
    buf.append( "(" );
    for (int i=3; i<4;i++){
     String tmp = ctx.getChild( i).getText();
     buf.append( nem.get(ctx.getChild(i) ) );
    }
    buf.append( ")");
    System.out.println( "Row output: "+buf.toString() );
    setNem( ctx, buf.toString() );
    return;
 
}
@Override
 public void exitElement(xmlParser.ElementContext ctx) {
  String name=tagName( ctx.getText() ); 
  System.out.println( "\n      EXITING ELEMENT: "+name );   
 
  if(name.equals( "math" )){
    StringBuilder buf = new StringBuilder();
    int last = 4;   //ONLY WORKS IF MATH HAS ONE CHILD
    for (int i=3; i<last;i++){
     buf.append( nem.get(ctx.getChild(i) ) );
    }
    setNem( ctx, buf.toString() );
    System.out.println( "$$$math element saved: "+buf.toString() );
    return;
   }
if(name.equals( "document" )){
    StringBuilder buf = new StringBuilder();
    int doclast = 4;   //ONLY WORKS IF MATH HAS ONE CHILD
    for (int i=3; i<doclast;i++){
     buf.append( nem.get(ctx.getChild(i) ) );
    }
    setNem( ctx, buf.toString() );
    System.out.println( "$$$document element saved: "+buf.toString() );
    return;
   }
   if(name.equals( "mi" )){
    StringBuilder buf = new StringBuilder();
    //for (int i=0; i<ctx.getChildCount();i++){
    //buf.append( nem.get(ctx.getChild(i) ) );
    //}
    //setNem( ctx, "X" );
    return;
   }

  //When you exit a row you gather up the children and
  //prepend a ( and append a ) to the string buffer
  int cnt = ctx.getChildCount();
  System.out.println( "         -->EXIT Element children: "+cnt );
  System.out.println( " text: "+ctx.getText() );
  boolean good = false;
  String tmp; 
  String impt = null;
  boolean skipOld = true;

if (skipOld){
  for (int i=0; i<ctx.getChildCount();i++){
   
   tmp = ctx.getChild(i).getText();
   if (i==0 && tmp.equals( "<" )){
    good = true;
   }
   if (good && i==1){
    tag = tmp;
   }
   if (good && i==3){
    impt = tmp;
   }
   System.out.println( "  child text: "+ctx.getChild(i).getText() );
  }
  System.out.println( "  TAG: "+tag+" value: "+impt );
 }//end skipOld
}
@Override
public void exitContent (xmlParser.ContentContext ctx) { 

    String childName = tagName( ctx.getChild(0) );
    int cnt = ctx.getChildCount();
    System.out.println( " -->exitContent first child: "+childName );
    if (childName != null && cnt == 1){
     if (childName.equals( "justWS" )){
      setNem( ctx, "" );
      return;
     }
    }
  
    System.out.println( "Content cnt: "+cnt+ " parent: "+
      parentName( ctx ) );

    int elems = 0;
    StringBuilder buf = new StringBuilder();
    for (int i=0; i<ctx.getChildCount();i++){
     childName = tagName( ctx.getChild (i) );
     if (childName != null){
      if (!childName.equals( "justWS" )){
       if (parentName( ctx ).equals( "msup" )){
         if (elems == 0) buf.append( "BASE: " );
         if (elems >0) buf.append( "SCRIPT: ");
       }
       buf.append( nem.get(ctx.getChild(i) ) );
       elems = elems+1;
       }
      }
    }
    System.out.println( "~~~exitContent--text: "+ctx.getText()+
      " concat: "+buf.toString()+" elem kids: "+elems );
    setNem( ctx, buf.toString() );
    return;
   
}
@Override
  public void enterChardata(xmlParser.ChardataContext ctx) {
   System.out.println( "\n    ==ENTERChardata" );
 
   
  ParseTree gp = grandParent( ctx );
  if (gp != null ){
   System.out.println( "    text: "+ctx.getText() +
     "grandparent: "+gp.getText() );
  }
     
} 

 //This could be a token element.
@Override
  public void exitChardata(xmlParser.ChardataContext ctx) {
   System.out.println( "\n     ==exitChardata" );
   String myText = ctx.getText();
   System.out.println( "       ==CDtext: "+myText );
   String grandparentName = grandparentName( ctx );
   System.out.println( "       ==CharData <GP>: "+grandparentName );

   if (grandparentName.equals( "mn" )){
    
    ParseTree gp = grandParent( ctx );
    System.out.println( "mn==getNem was: "+getNem( gp ));
    setNem( gp, "<mn>#"+myText+"</mn>" );
    return;
   }
  if (grandparentName.equals( "mo" )){
    ParseTree gp = grandParent( ctx );
    System.out.println( "mo==getNem was: "+getNem( gp ));
    setNem( gp, "<mo>OP"+myText+"</mo>" );
    return;
   }
   if (grandparentName.equals( "mi" )){
    ParseTree gp = grandParent( ctx );
    System.out.println( "mi==getNem was: "+getNem( gp ));
    setNem( gp, "<mi>VAR: "+myText+"</mi>" );
    return;
   }

   StringBuilder buf = new StringBuilder();
    for (int i=0; i<ctx.getChildCount();i++){
     buf.append( nem.get(ctx.getChild(i) ) );
    }
    int length = buf.toString().length();
    System.out.println( "    ---exitingChardata--text: "+ctx.getText()+
                        " concat: "+buf.toString()+
       " length: "+length );
  
    if (buf.toString() == null || length==4 ){
     setNem( ctx, "" );
     return;
    }
    //setNem( ctx, buf.toString() );
      if (buf.toString() == "\\r\\n"){
     setNem( ctx, "" );
     return;
    }
    setNem( ctx, "atadc" );
    return;
} 
//===========================================================
  public static void main( String[] args ) throws Exception {
//===========================================================

 System.out.println( "\n    Welcome to XML Antlr Parser!" );
 
 String inputFile = null;
 CharStream input = null;
 if ( args.length > 0 ) inputFile = args[0];
 if (inputFile == null){
    Reader myReader = new InputStreamReader( System.in, "UTF-8");
    CodePointCharStream cpcs = CharStreams.fromReader( myReader );
    input = cpcs;
 } else {
    File f = new File( inputFile );
    if (f.exists() && !f.isDirectory() )  {
       input = CharStreams.fromFileName( inputFile );
    } else {
       System.out.println( "\n OOPS! Cannot find input file: "
                           +inputFile );
       System.exit( 0 );
    }
  }

  //Tape6 myOutput = new Tape6( "uebout.txt" );

/**  I. Connect input to lexer, have it create a token stream,
        provided token stream to parser and instruct parser to
        build a parse tree.  
*/
        // The names and location of thelexer and parser
        // depends on how they were created from their
        //respective grammars
        // Here "xml" is the user-specified prefix
        xmlLexer lexer = new xmlLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        xmlParser parser = new xmlParser( tokens ); 
        parser.setBuildParseTree( true );
		
/**  II. Start tree with the topmost rule in the Parser 
         grammar.  (Rule #0 if grammar starts with that one.)
*/
         ParseTree tree = parser.document();
         String x = tree.toStringTree( parser);
         System.out.println( "     PARSE TREE: ");
         System.out.println( x );
        //myOutput.println( "     PARSE TREE: ");
        //wrap( tmpTree, 60, myOutput );

/**  III. Insert logic to walk and annotate tree. */
          
          //Custom class that extends BaseListener generated by ANTLR
          XMLproc proc = new XMLproc( tokens );
          ParseTreeWalker walker = new ParseTreeWalker();
          walker.walk( proc, tree );

/**  IV. Display annotation   */

     System.out.println( "ANNOTATION");
     System.out.println( proc.getNem( tree ) );

    //System.out.println();
     //System.out.println( "      ***Translation***" );
     //System.out.println(" Translated braille from annotated tree: ");
     //System.out.println( bt.getBrl( tree ) );

     //myOutput.finish();

 }//End Main.
}//End Class XMLProc.