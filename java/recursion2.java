import java.util.*;
public class recursion2{
    public static void printsumofNatural(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println("THe sum is:"+ sum);
            return;
        }
        sum +=i;
        printsumofNatural(i+1,n,sum);
        System.out.println(i);

}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number for sum: ");
        int n=sc.nextInt();
        printsumofNatural(1,n,0);

    }
}