package coqparser;

import antlr.coqLexer;
import antlr.coqParser;
import antlr.visitor.expr.ExprVisitor;
import antlr.visitor.term.TermVisitor;
import antlr.visitor.toplevel.CoqFileVisitor;
import antlr.visitor.vernacular.VernacularVisitor;
import model.tactics.expr.Expr;
import model.term.Term;
import model.toplevel.CompilationUnit;
import model.vernacular.Sentence;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public final class CoqParser {

    public static Term parseTerm(String term){

        CodePointCharStream input = CharStreams.fromString(term);

        coqLexer lexer = new coqLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        coqParser parser = new coqParser(tokens);

        ParseTree tree = parser.term();

        return (new TermVisitor().visit(tree));
    }

    public static Sentence parseSentence(String sentence){

        CodePointCharStream input = CharStreams.fromString(sentence);

        coqLexer lexer = new coqLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        coqParser parser = new coqParser(tokens);

        ParseTree tree = parser.sentence();

        return (new VernacularVisitor().visit(tree));

    }

    public static Expr parseExpression(String expression){

        CodePointCharStream input = CharStreams.fromString(expression);

        coqLexer lexer = new coqLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        coqParser parser = new coqParser(tokens);

        ParseTree tree = parser.expr();

        return( new ExprVisitor().visit(tree));

    }

    public static CompilationUnit parseCoqFile(String coqFile){
        CodePointCharStream input = CharStreams.fromString(coqFile);

        coqLexer lexer = new coqLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        coqParser parser = new coqParser(tokens);

        ParseTree tree = parser.coq_file();

        return( new CoqFileVisitor().visit(tree));
    }

    public static CompilationUnit parseCoqFile(File coqFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(coqFile));

        String coqFileStr = "";
        String readLine;
        while((readLine = bufferedReader.readLine()) != null){
            coqFileStr += readLine + "\n";
        }

        return parseCoqFile(coqFileStr);
    }
}
