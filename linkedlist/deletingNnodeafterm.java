// import java.util.LinkedList;
// public class deletingNnodeafterm {
//     this is the code for deleting the n nodes after m nodes in a linked list
//     public static void deleteNafterM(LinkedList<Integer>list,int m,int n){
//         if(list.size()==0){
//             System.out.println("Linkedlist is empty");
//             return;
//         }
//         if(m<0 ||n<0){
//             System.out.println("Invalid input");
//             return;
//         }
//         if(m>=list.size()){
//             System.out.println("m is greater than the size of the linked list");
//             return;
//         }
//         int i=0;
//         while(i<list.size()){
//             //skip m nodes
//             for(int j=0;j<m && i<list.size();j++){
//                 i++;
//             }
//             //delete n nodes
           
//             for(int j=0;j<n && i<list.size();j++){
//                 list.remove(i);
            
//             }
//         }
//         System.out.println("Deleted "+n+" nodes after "+m+" nodes");

//     }
   
//     public static void main(String[] args){
//        LinkedList<Integer>list=new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4); 
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        System.out.println("Before: " + list);
//        int m=2;
//        int n=3;
//        deleteNafterM(list,m,n);
//        System.out.println("After: " + list);
//     }
// }



public class deletingNnodeafterm {
    // this is the code for deleting the n nodes after m nodes in a linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static void deleteNafterM(Node head,int m,int n){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node curr=head;
        Node prev=null;
        while(curr!=null && m>0){
               for(int i=0;i<m && curr!=null;i++){
                prev=curr;
            curr=curr.next;
           
        }
        for(int i=0;i<n && curr!=null;i++){
            curr=curr.next;
        }
         // Connect previous node to remaining list
            if (prev != null) {
                prev.next = curr;
            }

    }

        }
     
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        deletingNnodeafterm list=new deletingNnodeafterm();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        System.out.println("Before: ");
        printList(head);
        list.deleteNafterM(head,2,3);
        printList(head);
    }

} 