import java.util.*;
public class code8 {
    //this is the code for duplicate parenthesis problem
    public static boolean duplicateParenthesis(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if (ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){ //duplicate found      duplicate parenthesis means-> that the operand and operator is not coming in the parethesis
                    return true;
                   
                }else{
                    s.pop();
                }
                
            }else{
                s.push(ch);

            }
        }
        return false;

    }
    public static void main(String args[]){
        String str="()";
        System.out.println(duplicateParenthesis(str));

    }
    
}
