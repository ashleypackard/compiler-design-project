import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {

	public static void main(String[] args) throws IOException {
 
        PL0Lexer lexer = new PL0Lexer(new ANTLRFileStream("sample2.pl0"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PL0Parser parser = new PL0Parser(tokens);
        ParseTree tree = parser.program();              // String representation of tree starting from root node
		
        // Interpreter
        //PL0Interpreter interpreter = new PL0Interpreter();
        //interpreter.visit(tree);
        
        // C++ Compiler
        PL0CppCompiler compiler = new PL0CppCompiler();
        compiler.visit(tree);
        
        // Java Compiler
        PL0JavaCompiler javaCompiler = new PL0JavaCompiler();
        javaCompiler.visit(tree);
	}

}
