

public class Linkedlist2 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
     public void addFirst(int data){
        // 1. create the new node
        Node newNode=new Node(data);
        size++;
        // 2. check if linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        // 3. newNode next=head  (linking step)

        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        // 1. create the new node
        Node newNode=new Node(data);
        size++;
        // 2.check if linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        // 3. tail next=newNode
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
     public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void findnth(int n){
        Node temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int idx=sz-n;
        Node prev=head;
        while(i<idx){
            prev=prev.next;
            i++;
          
        }
          prev.next=prev.next.next;
          return;
    }

    //finding the middle by using slow and fast pointer approach
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }
     //now will check is it palindrome or not
    public boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1-find mid
        Node midNode=findmid(head);
        //step2-reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        //step3-check left half and right half
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    public static void main(String[] args) {
        Linkedlist2 ll=new Linkedlist2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst (1);
        // ll.findnth(3);
        ll.print();

        System.out.println(ll.palindrome());
       
    }
    
}
