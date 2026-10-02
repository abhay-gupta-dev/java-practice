import java.util.*;
public class stack_using_2Queues2{
    //we will form queue using 2 stack and push will be O(n) and pop will be O(1)
     static class Stack{
       static Queue<Integer>q1=new LinkedList<>();
       static Queue<Integer>q2=new LinkedList<>();
       
       public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
       }
       //add              time complexity for add is O(1)
       public static void push(int data){
        int top=-1;
       if(!q1.isEmpty()){
        while(!q1.isEmpty()){
            q2.push(q1.pop());
        }
       }
       }
       //pop         //O(n)
       public static int pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
      return q1.remove();
       }
       //peek O(n)
       public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
      return q1.peek();
       }
      
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
      while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
      }



    }

    
}
