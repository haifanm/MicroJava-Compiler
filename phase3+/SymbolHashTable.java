import javax.net.ssl.SSLEngineResult;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;

public final class SymbolHashTable extends Hashtable{
    private static Hashtable symbolhashtable= new Hashtable<Integer, SymbolTableNode>();;


    public static Hashtable SymbolHashTable(){

        return symbolhashtable;
    }

    public static void insert(String name, String type,String structure, int isFinal, int scope) {
        SymbolTableNode n= (SymbolTableNode) symbolhashtable.get(scope);
        if(n==null){
            symbolhashtable.put(scope, new SymbolTableNode(name, type, structure, isFinal, scope));
        }else {
            while (n.child != null) {
                n = n.child;
            }
            n.child = new SymbolTableNode(name, type, structure, isFinal, scope);
        }


    }
    public static void insert(SymbolTableNode temp) {
        int scope=temp.scope;
        String name=temp.name;
        String type=temp.type;
        String structure=temp.structure;
        int isFinal=temp.isFinal;

        SymbolTableNode n= (SymbolTableNode) symbolhashtable.get(scope);
        if(n==null){
            symbolhashtable.put(scope, new SymbolTableNode(name, type, structure, isFinal, scope));
        }else {
            while (n.child != null) {
                n = n.child;
            }
            n.child = new SymbolTableNode(name, type, structure, isFinal, scope);
        }


    }

    public static SymbolTableNode get(int scope, String name) {

        SymbolTableNode n = (SymbolTableNode) symbolhashtable.get(scope);

        while(n != null)
        {
            if(n.name.equals(name))
            {
                return n;
            }
            n=n.child;
        }
        return null;
    }



}
