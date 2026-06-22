import java.util.Scanner;
public class mypow {
    public static double mypow(double x,long  n){
        if(n<0){
            x=1/x;
            n=-n;
        }
        double result=1.0;
        for(double i=0;i<n;i++){
            result *=x;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        long n=sc.nextLong();
        double ans=mypow(x,n);
        System.out.println(ans);

    }
    
}
