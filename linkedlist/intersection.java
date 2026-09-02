import java.util.HashMap;

public class intersection {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
 

    public static Node head1;
    public static Node head2;

    // public static Node intersectionNode(Node head1, Node head2) {

    //     while (head1 != null) {

    //         Node temp = head2;

    //         while (temp != null) {

    //             if (head1 == temp) {
    //                 return head1;
    //             }

    //             temp = temp.next;
    //         }

    //         head1 = head1.next;
    //     }

    //     return null;
    // }
    public static Node intersectionNode(Node head1, Node head2){
        HashMap<Node,Boolean> map=new HashMap<>();
        while(head1!=null){
            map.put(head1,true);
            head1=head1.next;
        }
        while(head2!=null){
            if(map.containsKey(head2)){
                return head2;
            }
            head2=head2.next;
        }
        return null;
    }
    
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        intersection list = new intersection();

        // First Linked List
        head1 = list.new Node(3);

        Node newNode = list.new Node(5);
        head1.next = newNode;

        Node newNode1 = list.new Node(9);
        head1.next.next = newNode1;

        Node newNode2 = list.new Node(7);
        head1.next.next.next = newNode2;

        // Second Linked List
        head2 = list.new Node(1);

        Node newNode3 = list.new Node(2);
        head2.next = newNode3;

        Node newNode4 = list.new Node(1);
        head2.next.next = newNode4;

        // Common node
        Node common = list.new Node(4);

        head2.next.next.next = common;
        head1.next.next.next.next = common;

        common.next = list.new Node(6);

        // Find intersection
        Node result = intersectionNode(head1, head2);

        if (result != null) {
            System.out.println("Intersection at node with data: " + result.data);
        } else {
            System.out.println("No intersection found.");
        }
        printList(head1);
        printList(head2);
    }
}