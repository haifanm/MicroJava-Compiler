import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ASTNode {
    static int id;
    static int pid;
    static String toprint= "";
    String type;
    String name;
Queue<ASTNode> children;

public ASTNode(String type, String name){
    this.type=type;
    this.name=name;
    this.id= -3;
    this.pid= -3;
    this.children=new LinkedList<ASTNode>();
}

public ASTNode(int id,int pid, String type, String name){
    this.id=id;
    this.type=type;
    this.name=name;
    this.children=new LinkedList<ASTNode>();
    this.pid= pid;
}


public ASTNode(){
    type=null;
    name=null;
    children=null;
}
public void add(ASTNode n){
    children.add(n);
}
public void add(String type, String name){
    children.add(new ASTNode(type, name));
}
public void printChildren(){
    Arrays.toString(children.toArray());
}
public void add(Stack<ASTNode> stack){
    for(ASTNode n: stack){
        this.add(n);
    }
}
    public String toString(){
        return type+" , "+name+" ";
    }

    public int getchildcount(){
        return children.size();
    }

    public Queue<ASTNode> getchildren(){
        return children;
    }

    public void printfulltree(ASTNode root){
        if(root.getchildcount()==0){
            toprint += "("+root.id+","+root.name+" ,p"+pid+")";
//            System.out.print(root.name+"    ");
        }else{
            //System.out.print("not leaf!!");

//            for(int i=0;i<root.getchildcount();i++){
//                toprint += "\t";
////                System.out.print("\t");
//            }
            toprint += "("+root.id+","+root.name+" ,p"+pid+")\n";
//            System.out.println(root.name+"    ");
            for(ASTNode n: root.getchildren()){
                printfulltree(n);
            }
            toprint += "\n";
        }
    }

    public void printnode(ASTNode root) {
//        printfulltree(root);
//        System.out.println(toprint);
        print(1);
        System.out.println(toprint);
    }

    public void printcaller(int level) {
        System.out.println("START");
        this.print(level);
//        System.out.println(toprint);
    }
    public void print(int level) {
        for (int i = 1; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println("("+this.name+")");
        try{
            for (ASTNode child : children) {
                child.print(level + 1);
            }
        }catch(Exception e){
            System.out.println("("+this.name+")");
        }
//        for (int i = 1; i < level; i++) {
//            toprint+="\t";
//        }
//        toprint+= "("+this.name+")\n";
//        try{
//            for (ASTNode child : children) {
//                child.print(level + 1);
//            }
//        }catch(Exception e){
//            toprint+= "ee("+this.name+")\n";
//        }
    }



}
