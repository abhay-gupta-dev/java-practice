public class Doublyll {

    public static class Node {

        int data;
        Node next;
        Node prev;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public static void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        size++;
    }

    // Add Last
    public static void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        size++;
    }
    public static void addMiddle(int data,int idx){
        Node newNode=new Node(data);
        while(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
 
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
        size++;
    }
    //remove at the biginning
    public static Node removeFirst(){
        if(head==null){
            System.out.println("Doubly Linked List is Empty");
            return null;
        }
        Node temp=head;
        if(head==tail){
            head=tail=null;
            return temp;
        }else{
            head=head.next;
            head.prev=null;
           

        }
         size--;
        return temp;

    }
    //remove at the end
    public static Node removeLast(){
        if(head==null){
            System.out.println("Doubly Linked List is Empty");
            return null;
        }
        Node temp=tail;
        if(head==tail){
         
            head=tail=null;
            size--;
        }else{
           
            tail=tail.prev;
            tail.next=null;
            size--;
        }
        return temp;
    }
    public static Node removeMiddle(int idx){
        if(head==null){
            System.out.println("Doubly Linked List is Empty");
            return null;
        }
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return null;
        }
        if(idx==0){
            removeFirst();
           
        }
        if(idx==size-1){
            removeLast();
        }
        Node temp=head;
        int i=0;
        while(i<idx){
            temp=temp.next;
            i++;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        size--;
        return temp;
    }
    //reverse the doubly linked list
    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // Print List
    public static void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Doublyll list = new Doublyll();

        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);

        list.printList();
        list.addMiddle(25, 2);
        list.printList();
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList();
        // list.removeMiddle(2);
        list.printList();
        list.reverse();
        list.printList();

        System.out.println("Size = " + size);
    }
}