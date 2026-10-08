
public class Bst1 {
  static class Node{
    int data; 
    Node left;
    Node right;
    public Node(int data){
      this.data=data;
    }
  }
  public static Node buildBst(Node root,int val){
    if(root==null){
      root=new Node(val);
      return root;
    }
    if(root.data>val){
      root.left=buildBst(root.left,val);

    }else{
      root.right=buildBst(root.right,val);
    }
    return root;
  }
  public static void inorder(Node root){
    if(root==null){
      return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static boolean search(Node root,int key){
    if(root==null){
      return false;
    }
    if(root.data==key){
      return true;
    }
    if(root.data>key){
      return search(root.left,key);
    }
    if(root.data<key){
      return search(root.right,key);
    }
    return false;

  }
  public static Node delete(Node root,int val){
    if(root==null){
      return null;
    }
    if(root.data>val){
      root.left=delete(root.left,val);

    }else if(root.data<val){
      root.right=delete(root.right,val);
    }else{
      //case 1: no children
      if(root.left==null && root.right==null){
        return null;
      }
      // case 2: 1 children
      if(root.left==null){
        return root.right;
      }else if(root.right==null){
        return root.left;
      }
      //case 3: 2 children
      Node IS=findinordersuccessor(root.right);
      root.data=IS.data;
      root.right=delete(root.right,IS.data);
    }
    return root;
   
  }
  public static Node findinordersuccessor(Node root){
    while(root.left!=null){
      root=root.left;
    }
    return root;
  }
  public static void printinrange(Node root,int k,int m){
    if(root==null){
      return;
    }
    if(root.data>=k && root.data<=m){
      printinrange(root.left,k,m);
      System.out.print(root.data+" ");
      printinrange(root.right,k,m);
    }
    else if(root.data<k){
       printinrange(root.left,k,m);
    }else{
      printinrange(root.right,k,m);
    }
  }
    public static void main(String[] args) {
      int values[]={8,5,3,1,4,6,10,11,14};
      Node root=null;
      for(int i=0;i<values.length;i++){
        root=buildBst(root,values[i]);
      }
      inorder(root);
      System.out.println();
      if(search(root,9)){
        System.out.println("found");
      }else{
        System.out.println("not found");
      }
      delete(root,9);

      root=delete(root,5);
      System.out.println();
      inorder(root);

     
       System.out.println();
        printinrange(root,5,12);
    



     
    }
}