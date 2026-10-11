// import java.util.*;
// public class java4{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         do { 
//             System.out.println("Enter the number:");
//             int n=sc.nextInt();
//             if(n%10==0){
//                 break;
//             }
//             System.err.println(n);
            
//         } while (true);
//     }
// }


import java.util.Scanner;
public class java4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        do { 
            System.out.println("Enter the number:");
            long n=sc.nextLong();
            if(n%10==0){
                continue;
            };
            System.out.println("the number is: "+n);
            
        } while (true);
    }
}