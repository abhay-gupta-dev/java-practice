import java.util.*;

public class Tree_deleteleaf {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteTreeNode(Node root, int target) {

        if (root == null) {
            return null;
        }

        // Delete from left subtree
        root.left = deleteTreeNode(root.left, target);

        // Delete from right subtree
        root.right = deleteTreeNode(root.right, target);

        // Delete current node if it became a target leaf
        if (root.left == null &&
            root.right == null &&
            root.data == target) {

            return null;
        }

        return root;
    }
    public static void printtree(Node root){
      if(root==null){
        return;
      }
      Queue<Node>q=new LinkedList<>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
        Node curr=q.remove();
        if(curr==null){
          System.out.println();
          if(q.isEmpty()){
            break;
          }else{
            q.add(null);
          }
        }else{
          System.out.print(curr.data+" ");
          if(curr.left!=null){
            q.add(curr.left);
          }
          if(curr.right!=null){
            q.add(curr.right);
          }
        }

      }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.right.left = new Node(2);
        root.left.right = new Node(5);

        root = deleteTreeNode(root, 2);
        printtree(root);

        
    }
}