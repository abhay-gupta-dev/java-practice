import java.util.*;
public class queue_using_2Stack2 {
    //we will form queue using 2 stack and push will be O(1) and pop will be O(n)
     static class Queue{
       static Stack<Integer>s1=new Stack<>();
       static Stack<Integer>s2=new Stack<>();
       
       public static boolean isEmpty(){
        return s1.isEmpty();
       }
       //add              time complexity for add is O(1)
       public static void add(int data){
      s1.push(data);
       }
       //pop         //O(n)
       public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
       while(!s1.isEmpty()){
        s2.push(s1.pop());
       }
       int front=s2.pop();
         while(!s2.isEmpty()){
        s1.push(s2.pop());
         }

      return front;
       }
       //peek O(n)
       public static int peek(){
         if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        while(!s1.isEmpty()){
          s2.push(s1.pop());
        }
        int front=s2.peek();
      while(!s2.isEmpty()){
        s1.push(s2.pop());
      }
      return front; 
       }
      
    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }



    }

    
}
