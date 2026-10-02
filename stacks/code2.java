import java.util.Stack;
public class code2 {
    public static void pushAtBottom(Stack<Integer>s,int data){
    //   Stack<Integer>temp=new Stack<>();
    //   while(!s.isEmpty()){
    //     temp.push(s.pop());
    //   }
    //   s.push(data);
    //   while(!temp.isEmpty()){
    //     s.push(temp.pop());
    //   }

    //by recursion
      //base case
     if(s.isEmpty()){
        s.push(data);
        return;
    }
    //recursive call
    int top=s.pop();
   pushAtBottom(s,data);
   s.push(top);

    }
  
    public static void main(String[] args){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,0);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
