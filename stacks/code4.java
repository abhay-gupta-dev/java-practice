import java.util.Stack;
public class code4 {
    //reverse a stack
    public static Stack<Integer> reverseStack(Stack<Integer>s){
        Stack<Integer>temp=new Stack<>();
        while(!s.isEmpty()){
            temp.push(s.pop());
        }
       return temp;
    }
    //push at bottom by recursion
    public static void pushAtBottom(Stack<Integer>s,int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    //by recursion
    public static void reverseStackrec(Stack<Integer>s){
        //base case
        if(s.isEmpty()){
            return;

        }
        //recursive case
        int top=s.pop();
        reverseStackrec(s);
        pushAtBottom(s,top);

    }
    public static void main(String[] args){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       // s=reverseStack(s);
       System.out.println("original stack:");
       System.out.println(s);
       reverseStackrec(s);
        System.out.println("Reversed stack:");
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        System.out.println(s);
    }
    
}
