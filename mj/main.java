import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Parser.TraceListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.prefs.NodeChangeListener;

public class main  {
    public static void main (String args[]) throws java.io.IOException {
        grLexer lexer = new grLexer( CharStreams.fromFileName("C:\\Users\\MSE\\IdeaProjects\\java\\src\\sample.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        grParser parser = new grParser(tokens);
        grBaseListener listener=new grBaseListener();
        parser.setLexer(lexer);
        lexer.setTable();

        //lexer.getAllTokens();

        parser.prog();
        System.out.println("phase3+/Symbol Table");
        lexer.printSymbolTable();






        /*
        String sql = "SELECT log AS x FROM t1 \n" +
                "GROUP BY x\n" +
                "HAVING count(*) >= 4 \n" +
                "ORDER BY max(n) + 0";

        // Create a lexer and parser for the input.
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));

        // Invoke the `select_stmt` production.
        ParseTree tree = parser.select_stmt();
        ParseTreeWalker walker = new ParseTreeWalker();
        SQLiteListener listener = new SQLiteBaseListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        System.out.println(listener.);
        */


        /*System.out.println("tempstack: ");
        Arrays.toString(lexer.tempStack.toArray());
        System.out.println("nodestack: ");
        Arrays.toString(lexer.nodeStack.toArray());*/

    }
}
