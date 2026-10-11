import java.util.*;
public class natural {
  public static int sumofnatural(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=sum+i;
        

    }
    System.out.println("Sum of n natural number is: "+sum);
    return sum;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int num=sc.nextInt();
    int result =sumofnatural(num);
  }
    
}
