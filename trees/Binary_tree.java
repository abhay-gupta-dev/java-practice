import java.util.*;
public class Binary_tree{
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
      public static int idx=-1;
        public static Node buildTree(int nodes[]){
          idx++;
          if(nodes[idx]==-1){
            return null;
          }
          Node newNode=new Node(nodes[idx]);
          newNode.left=buildTree(nodes);
          newNode.right=buildTree(nodes);
          return newNode;
        }
        public static void preOrder(Node root){
          if(root==null){
            return;
          }
          System.out.print(root.data+" ");
          preOrder(root.left);
          preOrder(root.right);
        }
        public static void inorder(Node root){
          if(root==null){
            return;
          }
          inorder(root.left);
          System.out.print(root.data+" ");
          inorder(root.right); 
        }
        public static void postorder(Node root){
          if(root==null){
            return;
          }
          postorder(root.left);
          postorder(root.right);
          System.out.print(root.data+" ");
        }
        //level order traversal
        public static void levelTraversal(Node root){
          if(root==null){
            return;
          }
          Queue<Node>q=new LinkedList<>();
          q.add(root);
          q.add(null);
          while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
              System.out.println();
              if(q.isEmpty()){
                break;
              }else{
                q.add(null);
              }
            }else{
              System.out.print(currNode.data);
              if(currNode.left!=null){
                q.add(currNode.left);
              }
              if(currNode.right!=null){
                q.add(currNode.right);
              }
            }
            
          }

        }
        public static int height(Node root){
          if(root==null){
            return 0;
          }
          int lh=height(root.left);
          int rh=height(root.right);
          return Math.max(lh,rh)+1;
        }
        public static int countofnodes(Node root){
          if(root==null){
            return 0;
          }
          int lc=countofnodes(root.left);
          int rc=countofnodes(root.right);
          int totalcount=lc+rc+1;
          return totalcount;
        }
        public static int sumofnodesdata(Node root){
          if(root==null){
            return 0;
          }
          int lsum=sumofnodesdata(root.left);
          int rsum=sumofnodesdata(root.right);
          int tsum=lsum+rsum+root.data;
          return tsum;

        }
        public static int diameter2(Node root){
          if(root==null){
            return 0;
          }
          //ld=left diameter
          //lh=left height
          //rd=right diameter
          //rh=right height
          int ld=diameter2(root.left);
          int lh=height(root.left);
          int rd=diameter2(root.right);
          int rh=height(root.right);
          int selfDiameter=lh+rh+1;
          return Math.max(selfDiameter,Math.max(ld,rd));
        }
    }
    static class Info{
      int diam; //diameter
      int heig;//height

      //constructor
      public Info(int diam,int heig){
        this.diam=diam;
        this.heig=heig;
      }
      public static Info diameter(Node root){
        if(root==null){
          return new Info(0,0);
        }
        Info linfo=diameter(root.left);
        Info rinfo=diameter(root.right);
        int diam=Math.max(Math.max(linfo.diam,rinfo.diam),linfo.heig+rinfo.heig+1);
        int heig=Math.max(linfo.heig,rinfo.heig)+1;
        return new Info(diam,heig);
      }
    }

    public static void main(String args[]){
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree=new BinaryTree();
      Node root=tree.buildTree(nodes);
      //tree.preOrder(root);
      //tree.inorder(root);
      //tree.postorder(root);
      tree.levelTraversal(root);
      System.out.println("height of tree is: "+tree.height(root));
      System.out.println("the total count of nodes are: "+tree.countofnodes(root));
      System.out.println("the sum of all nodes: "+tree.sumofnodesdata(root));
      System.out.println("the maximum diameter of tree is "+tree.diameter2(root));
      
    Info Optimized=Info.diameter(root);
    System.out.println("the optimized approache gives the same diameter as: "+Optimized.diam);
        System.out.println("the optimized approache gives the same height as: "+Optimized.heig);

    }
}