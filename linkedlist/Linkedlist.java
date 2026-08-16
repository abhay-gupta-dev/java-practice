public class Linkedlist{
    public static class Node{
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
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev: i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
      int val=prev.next.data; //or tail.data
     prev.next=null;
     tail=prev;
     size--;
     return val;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    public int helper(Node head,int key){
        //base case
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;

    }
    public Node reverserecursive(Node head){
        //base case
        if(head==null || head.next==null){
            return head;
        }
        Node newhead=reverserecursive(head.next);
        //next of head is head.next and we want to point it to head so head.next.next=head 
        head.next.next=head;
        //next of head should point to null
        head.next=null;
        return newhead;
    }
    public static void main(String args[]){
        Linkedlist ll=new Linkedlist();
         ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addMiddle(4,2);
        ll.print();

        // ll.removeFirst();
        // ll.print();
        //  ll.removeLast();
        // ll.print();

         head= ll.reverserecursive(head);
        ll.print();
       
        System.out.println(size);
        System.out.println(ll.recsearch(4));
        System.out.println(ll.recsearch(10));
       

        
       
    }
}