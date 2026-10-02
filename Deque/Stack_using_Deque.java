import java.util.*;
public class Stack_using_Deque{         //making stack using Deque
    static class Stack{
      static  Deque<Integer>d=new LinkedList<>();
        public boolean isEmpty(){
              return d.isEmpty(); // Fixed: added d.isEmpty()
        }
        public static void push(int data){
            d.addLast(data);
        }
        public static int pop(){
           return d.removeLast();

        }
        public static int  peek(){
           return d.getLast();
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