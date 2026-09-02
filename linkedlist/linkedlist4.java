public class linkedlist4 {
    //merge sort of linkedlist
   public static class Node{
        int data;
        Node next;
        //constructor
         Node(int data){
            this.data=data;
            this.next=null;

         }
         
       
    }
        public static Node head;
        public static Node tail;
        private static Node getMid(Node head){
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;  //midNode
        }
        private static Node merge(Node head1,Node head2){
            Node mergell=new Node(-1);
            Node temp=mergell;
            while(head1!=null && head2!=null){
                if(head1.data<=head2.data){
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;

                }else{
                     temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }
            }
            while(head1!=null){
                 temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;

            }
            while(head2!=null){
                   temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;

            }
            return mergell.next;
        }
        public static Node mergeSort(Node head ){
            if(head==null || head.next==null){
                return head;
            }
            //find mid
            Node mid=getMid(head);

            //applying mergesort on lefthalf and righthalf
            Node righthead=mid.next;
            mid.next=null;
            Node left=mergeSort(head);
            Node right=mergeSort(righthead);

            return merge(left,right);
        }
        public static void zigzag(){
            //find mid
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }
            Node mid=slow;
            //reversing the second half of list
            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;    
            }
            //making the zigzag linkedlist
            Node left=head;
            Node right=prev;
            Node nextL,nextR;
            while(left!=null && right!=null){
                nextL=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextL;

                  // MISSING:
    left = nextL;
    right = nextR;
            }
         

        }



         public static void printList(){
            Node temp=head;
            while(temp!=null){
                 System.out.print(temp.data+"->");
            temp=temp.next;
            }
               System.out.println("null");

         }
    public static void main(String args[]){
         head=new Node(4);
         head.next=new Node(3);
         head.next.next=new Node(5);
         head.next.next.next=new Node(1);
        //  System.out.println("Before sorting:");
        printList();
       // head=mergeSort(head);
       zigzag();
       //  System.out.println("After sorting:");
           printList();
    }
    
}
