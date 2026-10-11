// import java.util.*;
// public class functions{

//     public static int printsum(int num1,int num2){
//         int sum=num1+num2;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=printsum(a,b);
//         System.out.println("the sum is: "+ sum);

//     }
// }


// import java.util.*;
// public class functions{

//     public static int swap(int num1,int num2){
//         int temp=num1;
//         num1=num2;
//         num2=temp;
//          System.out.println(num1);
//         System.out.println(num2);
         
//         return 2;
        
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
        
//         swap(a,b);
      
//     }
// }


// import java.util.*;
// public class functions{
   
//     public static void printmultiplicationtable(int num1){
       

//         for(int i=1;i<=10;i++){
//          System.out.println(num1 +"*"+i+ "=" +num1*i);
//         }

    
        
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int a=sc.nextInt();
       
        
//         printmultiplicationtable(a);
      
      
      
       

//     }
// }


// import java.util.*;
// public class functions{
   
//     public static void printfactorial(){
//          Scanner sc = new Scanner(System.in);
          
      
//        char choice;
//        do { 
//           System.out.print("Enter number: ");

//          int num1=sc.nextInt();
//           int fact=1;
//         if(num1==0 || num1==1){
//             fact=1;
//         }else{
            
//         for(int i=1;i<=num1;i++){
//             fact=fact*i;
           
//         }
//         }
//         System.out.println("the fact is "+ fact);
//         System.out.println("do you want another number to get fact?(y/n)");
//         choice=sc.next().charAt(0);
           
//        } while (choice=='y' || choice=='Y');

    
        
//     }
//     public static void main(String[] args){
       
//        printfactorial();
//     }
// }
// public class functions{
//     // public static int printfactorial(int n){
//     //     int fact=1;
//     //     if(n==0 || n==1){
//     //         fact=1;
//     //     }
//     //     for(int i=1;i<=n;i++){
//     //         fact=fact*i;
//     //     }
//     //     return fact;
//     // }
//     // public static int printbincoefficient(int n,int r){
//     //     int n_fact=printfactorial(n);
//     //     int r_fact=printfactorial(r);
//     //     int nmr_fact=printfactorial(n-r);
//     //     int binco=n_fact/(r_fact*nmr_fact);
//     //     return binco;
//     // }
//         //function overloading
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static float sum(float a,float b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         // Scanner sc=new Scanner(System.in);
//         // int n=sc.nextInt();
//         // int r=sc.nextInt();
//         // int res= printbincoefficient(n,r);
//         //  System.out.println("the binnary coefficient "+ "is "+res);
//         System.out.println(sum(5,6));
//         System.out.println(sum(5.6f,6.5f));

//     }

// }

// import java.util.*;
// public class functions{

//     public static boolean isprime(int n){
//         boolean isprime=true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 isprime=false;
//             }
//         }
//         return isprime;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(isprime(n));

        
//     }
// }


// import java.util.*;
// public class functions{

//     public static boolean isprime(int n){
//         boolean isprime=true;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 isprime=false;
//             }
//         }
//         return isprime;
//     }


//     public static void primeinrange(int n){
       
//         for(int i=2;i<=n;i++){
//           if( isprime(i)){
//             System.out.print(i+" ");
//           }
//         }
       
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//            primeinrange(n);

        
//     }
// }
// public class functions{
//     public static double printavg(double a,double b,double c){
//         double avg;
//         avg=(a+b+c)/3;
//         return avg;
//     }
//     public static void main(String[] args) {
//         System.out.println("the avg of three numbers is "+ printavg(59.999,5.66544,45.987));
        
//     }
// }

// import java.util.*;
// public class functions{
//     public static boolean iseven(int n){
      
//         return n%2==0;
//     }
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
        
//         char choice;
//         do { 
//                System.out.print("Enter number: ");
//             int n=sc.nextInt();
//           boolean res=iseven(n);
          
          
//             System.out.println(res);
//             System.out.println("do you want another number to check?(y/n)");
//             choice=sc.next().charAt(0);
//         } while (choice=='y' || choice=='Y');
       
//         sc.close();
//     }
// }

import java.util.*;
public class functions{
    public static int printsum(int n){
        int original=n;
        int sum=0;
        while(n !=0){
            int rem=n%10;
            sum=sum+rem;
            n /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=printsum(n);
        System.out.println("the res is "+res);

        
    }
}