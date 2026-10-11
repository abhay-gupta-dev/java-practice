import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("the number " +n+" is a prime number" );
        }else{
            System.out.println("not a prime number");
        }
        
    }
    
}
