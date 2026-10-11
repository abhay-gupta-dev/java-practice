import java.util.*;
public class reversestr {
    public static void printreverse(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printreverse(str,idx-1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        printreverse(str,str.length()-1);


    }
    

}