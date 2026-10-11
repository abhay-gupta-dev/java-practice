import java.util.*;
public class palindrome {
    public static boolean ispalindrome(int n){
        int original=n;
        int reverse=0;
        while(n !=0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n /=10;

        }
        if(original==reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=ispalindrome(n);
        System.out.println(res);
        
    }
    
}
