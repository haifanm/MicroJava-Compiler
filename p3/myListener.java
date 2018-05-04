import org.antlr.v4.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Parser.TraceListener;
import org.antlr.v4.runtime.Parser.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.prefs.NodeChangeListener;

public class myListener extends grBaseListener {

    public void enterVarDecl(grParser.VarDeclContext ctx){
//        CommonTokenStream tokens 1= new CommonTokenStream(lexer);
        System.out.println("entered");
    }
}
