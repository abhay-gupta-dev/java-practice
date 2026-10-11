import java.util.*;
public class recursion7{
    static int count = 0;
    public static void towerofhanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+ n + " from "+ src +" to "+ dest);
             count++;
            return;

        }
        towerofhanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+ n + " from "+ src +" to "+ dest);
        count++;
        towerofhanoi(n-1,helper,src,dest);



    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int n=sc.nextInt();
         towerofhanoi(n,"S","H","D");
            System.out.println("The number of steps taken are: "+ count);
        
        
    }
}
