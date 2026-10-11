// import java.util.*;
// public class pattern {
//     public static void printinvertedstar(int number){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       for(int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print("*"+" ");
//         }
//         System.out.println();
//       }
//     }
//     public static void main(String[] args) {
//         printinvertedstar(5);
        
//     }
    
// }


// import java.util.*;
// public class pattern {
//     public static void printpyramid(int number){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//       }
//     }
//     public static void main(String[] args) {
//         printpyramid(5);
        
//     }
    
// }



// import java.util.*;
// public class pattern {
//     public static void printpyramid(int number){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//       }
//     }
//     public static void main(String[] args) {
//         printpyramid(5);
        
//     }
    
// }

import java.util.*;
public class pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(ch +" ");
                ch++;

            }
            System.out.println();
        }
    }

}

