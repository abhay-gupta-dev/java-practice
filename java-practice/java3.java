// import java.util.*;
// public class java3 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         float a=sc.nextInt();
//         System.out.println(a);



//     }
    
// }
// 



//type casting

// import java.util.*;
// public class java3 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         float a=sc.nextFloat();
//         int b=(int)a;
//         System.out.println(b);





//            }

// }

// public class java3 {
//     public static void main(String[] args){
//         char ch1='a';
//        char ch2='b';
//        System.out.println(ch2-ch1);
//        System.out.println((int)(ch2));
// }

// }


//average of three numbers
// import java.util.*;
// public class java3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first no. ");
//         int a=sc.nextInt();
//          System.out.println("Enter second no. ");
//         int b=sc.nextInt();
//          System.out.println("Enter third no. ");
//         int c=sc.nextInt();

//         float sum= a+b+c;
//         double avg=sum/3;
//         System.out.println("the average is: "+avg);

//           sc.close();
        
//     }
  
// }




// calculating side of square
// import java.util.*;
// public class java3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        System.out.println("enter the side of square: ");
//        float a=sc.nextFloat();
//        double area=a*a;
//        System.out.println("the area of square is: "+area);

//           sc.close();
        
//     }
  
// }


//giving the bill to the user
// import java.util.*;
// public class java3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//       int pencil=sc.nextInt();
//       int pen=sc.nextInt();
//       int eraser=sc.nextInt();

//       int total=pencil+pen+eraser;

//       System.out.println("the total amount is: "+ total);
//       float gst=0.18f*(total);
//       float newbill= total+gst;
//       System.out.println("the new bill is: "+newbill);


//           sc.close();
        
//     }
  
// }


//tax calculator


// import java.util.*;
// public class java3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int income=sc.nextInt();
//         int tax;

//         if(income<500000){
//             tax=0;
//         }else if (income>=500000 && income<1000000) {
//             tax= (int)(income*0.2);
            
//         }else{
//             tax=(int)(income*0.3);
//         }
//         System.out.println("your tax is: "+ tax);

//     }
// }


// import java.util.*;
// public class java3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the first no.");
//         int a=sc.nextInt();
//           System.out.println("enter the second no.");
//            int b=sc.nextInt();
//             System.out.println("enter the third no.");
//             int c=sc.nextInt();


//             if((a>=b) && (a>=c))
//                 System.out.println("a is greatest no.");
//             else if((b>=c))
//                 System.out.println("b is greatest.");
//             else{
//                 System.out.println("c is greatest.");
//             }

//     }
// }
// public class java3{
//     public static void main(String[] args){
       
//         int number=105;

//         String result=((number%2)==0)?"even":"odd";
//         System.out.println(result);


//     }
// }


// import java.util.*;
// public class java3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number: ");
//         int num=sc.nextInt();
//         if(num>0){
//             System.out.println("The number is positive i.e. "+num);
        
//         }else if(num==0){
//             System.out.println("this is 0 number");
//         }
//         else{
//             System.out.println("the number is negative i.e."+ num);
//         }
//     }
// }
// import java.util.*;
// public class java3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the year: ");
//         int year=sc.nextInt();
//         boolean x=(year%4)==0;
//         boolean y = (year%100) != 0;
//         boolean z=((year%100)==0 && (year%400)==0);

//         if(x && (y||z)){
//             System.out.println("year "+ "is a leap year");
//         }else{
//             System.out.println("year "+ "is not a leap year");
//         }
//     }
// }


// import java.util.*;
// public class java3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the year: ");
//         int n=sc.nextInt();
//         int counter=1;
//         while(counter<=n){
//             System.out.print(counter+" ");
//             counter++;
//         }
       
//         }
//     }


// import java.util.*;
// public class java3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the year: ");
//         int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
       
//         }
//     }


// import java.util.*;
// public class java3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the year: ");
//         int n=sc.nextInt();
//     while(n>0){
//         int lastdigit= n%10;
//         System.out.print(lastdigit);
//         n=n/10;
//     }
       
//         }
//     } 


import java.util.*;
public class java3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year: ");
        int n=sc.nextInt();
        int rev=0;
    while(n>0){
        int lastdigit= n%10;
       rev=(rev*10)+lastdigit;
        n=n/10;
    }
     System.out.print(rev);
       
        }
    } 
