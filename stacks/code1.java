import java.util.*;

public class code1{
    //stack implementation using ArrayList
    public static class StackA{
       public static ArrayList<Integer>list=new ArrayList<>();

        //check if stack is empty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //adding element to the stack
        public static void push(int data){
            list.add(data);
        }
        //removing element from the stack
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //returning the top element of the stack
        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static class StackB{
        //stack implementation using linkedlist
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;  
            }
            return head.data;
        }
    }
    public static void main (String args[]){
        // StackA s=new StackA();
      //  StackB s=new StackB();
      Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
              System.out.println(s.peek());
             s.pop();
          
        }

    }
}