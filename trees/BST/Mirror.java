import java.util.*;

public class Mirror{
  static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data=data;
    }
  }
  public static Node createmirrortree(Node root){
    if(root==null){
      return null;
    }
     Node lefttree=createmirrortree(root.left);
     Node righttree=createmirrortree(root.right);
     root.left=righttree;
     root.right=lefttree;
     return root;
  }
  
  public static void printTree(Node root){
    if(root == null) return;
    System.out.print(root.data + " ");
    printTree(root.left);
    printTree(root.right);
  }
    public static void main(String[] args) {
     Node root=new Node(8);
     root.left=new Node(3);
     root.right=new Node(10);
     root.left.left=new Node(1);
     root.left.right=new Node(5);
     root.right.right=new Node(11);
     
     System.out.println("Original Tree: ");
     printTree(root);
     root = createmirrortree(root);
     System.out.println("\nMirror Tree: ");
     printTree(root);
  }
}