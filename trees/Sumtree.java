public class Sumtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static int Transformsumtree(Node root){
      if(root==null){
        return 0;
      }
      int leftchild=Transformsumtree(root.left);
      int rightchild=Transformsumtree(root.right);
      int data=root.data;
      int  newleft=root.left==null?0:root.left.data;
      int newright=root.right==null?0:root.right.data;
     root.data=newleft+leftchild+newright+rightchild;
      return data;
      
    }
    public static void preorder(Node root){
      if(root==null){
        return;
      }
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);
    }
    public static boolean univalued(Node root){
      if(root==null){
        return true;
      }
      if(root.left!=null && root.data!=root.left.data){
        return false;
      }
      if(root.right!=null && root.data!=root.right.data){
        return false;
      }
      boolean left=univalued(root.left);
      boolean right=univalued(root.right);
      return left && right;

    }

    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right=new Node(7);
      Transformsumtree(root);
        preorder(root);
        System.out.println();
        System.out.println(univalued(root));
    }
}