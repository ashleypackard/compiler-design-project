import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MainJavaCompiler {

	public static void main(String[] args) throws IOException {
		PL0Lexer lexer = new PL0Lexer(new ANTLRFileStream("sample.pl0"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PL0Parser parser = new PL0Parser(tokens);
        ParseTree tree = parser.program();              // String representation of tree starting from root node
		
        PL0JavaCompiler javaCompiler = new PL0JavaCompiler();
        javaCompiler.visit(tree);
	}

}
