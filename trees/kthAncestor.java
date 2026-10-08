
public class kthAncestor {
  static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data=data;
    }
  }
  public static int kthAncestor(Node root,int n,int k){
    if(root==null){
      return -1;
    }
    //first we have to find the **n value
    if(root.data==n){
      return 0;
    }
    int leftfound=kthAncestor(root.left,n,k);
    int rightfound=kthAncestor(root.right,n,k);
    if(leftfound==-1 && rightfound==-1){
      return -1;
    }
    int max=Math.max(leftfound,rightfound);
    if(max+1==k){
      System.out.println(root.data);
    }
    return max+1;
  }
    public static void main(String[] args) {
          Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
      System.out.println("Hello, World!");
      kthAncestor(root,5,2);
    }
}
