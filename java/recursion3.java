import java.util.*;
public class recursion3{
    public static int printfactorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fact_nm1=printfactorial(n-1);
        int fact=n*fact_nm1;
        return fact;

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number: ");
        int n=sc.nextInt();
       int ans= printfactorial(n);
       System.out.println("The final answer is: "+ans);

    }
}