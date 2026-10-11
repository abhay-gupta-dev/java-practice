import java.util.*;
public class bintodec {
    public static void bintodec(int binnum){
        int mynum=binnum;
        long decnum=0;
        int pow=0;
        while(binnum>0){
               int lastd=binnum%10;

        decnum=decnum+(lastd*(int)Math.pow(2,pow));
        pow++;
        binnum /=10;


        }
        System.out.println("decnum of "+mynum+ " is "+decnum );
     

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        bintodec(n);

    }
    
}
