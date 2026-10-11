import java.util.*;


public class root2leaf {
 static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
 }
 public static void printroot2leaf(Node root,ArrayList<Integer>path){
    if(root==null){
        return;
    }
    path.add(root.data);
    if(root.left==null && root.right==null){
      printpath(path);
    }
    printroot2leaf(root.left,path);
    printroot2leaf(root.right,path);
    path.remove(path.size()-1);
 }
 public static void printpath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+"->");
    }
    System.out.println("NULL");
 }
    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

         printroot2leaf(root,new ArrayList<>());

    }
}