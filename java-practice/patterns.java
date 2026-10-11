// import java.util.*;
// public class patterns{
//     public static void printhollowrec(int totrows,int totcols){
//         for(int i=1;i<=totrows;i++){
//             for(int j=1;j<=totcols;j++){
//                 if(i==1 || i==totrows || j==1 || j==totcols){
//                     System.out.print("*");


//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         printhollowrec(n,m);

//     }
// }

// import java.util.*;
// public class patterns{
//     public static void printhollowrec(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                  System.out.print(" ");
               
//             }
//             for(int j=1;j<=i;j++){
//                  System.out.print("*"+" ");
               
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
       
//         printhollowrec(n);

//     }
// }

// import java.util.*;
// public class patterns{
//     public static void printhollowrec(int n){
//         for(int i=n;i>=1;i--){
        
//             for(int j=1;j<=i;j++){
//                  System.out.print(j+" ");
               
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
       
//         printhollowrec(n);

//     }
// }

// import java.util.*;
// public class patterns{
//     public static void printhollowrec(int n){
//          int num=1;
//         for(int i=1;i<=n;i++){
       
//             for(int j=1;j<=i;j++){
                
//                  System.out.print(num+" ");
//                  num++;
               
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
       
//         printhollowrec(n);

//     }
// }

// import java.util.*;
// public class patterns{
//     public static void printhollowrec(int n){
        
//         for(int i=1;i<=n;i++){
       
//             for(int j=1;j<=i;j++){
                
//                 if((i+j)%2==0){
//                     System.out.print("1"+" ");
//                 }else{
//                     System.out.print("0"+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
       
//         printhollowrec(n);

//     }
// }

//butterfly pattern

// import java.util.*;
// public class patterns{
//     public static void printhollowrec(int n){
        
//         for(int i=1;i<=n;i++){
       
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
            
//             for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//               System.out.print("*");

//         }
//         System.out.println();
    
//     }
        
//         for(int i=n;i>=1;i--){
       
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
            
//             for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//               System.out.print("*");

//         }
//         System.out.println();
    
//     }
        
       
// }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
       
//         printhollowrec(n);

//     }
// }



//rhombus

// import java.util.*;
// public class patterns{
//     public static void printrhombus(int n){
//         for(int j=1;j<=n;j++){
//             for(int i=1;i<=n-j;i++){
//                 System.out.print(" ");
//             }
            
//             for(int i=1;i<=n;i++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
        
      
       
// }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
       
//         printrhombus(n);

//     }
// }


//hollow rhombus
// import java.util.*;
// public class patterns{
//     public static void printhollowrhombus(int n){
//         for(int j=1;j<=n;j++){
//             for(int i=1;i<=n-j;i++){
//                 System.out.print(" ");
//             }
            
//             for(int i=1;i<=n;i++){
//                 if(i==1 || i==n || j==1 || j==n){
//                    System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
                
//             }
//             System.out.println();

//         }
        
      
       
// }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
       
//         printhollowrhombus(n);

//     }
// }


//diamond pattern
import java.util.*;
public class patterns{
    public static void printhollowrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
               
                
            }
            System.out.println();

        }
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
               
                
            }
            System.out.println();

        }
        
        
      
       
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        printhollowrhombus(n);

    }
}

