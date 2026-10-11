

// public class array{

//     public static void printarray(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[]={95,97,90};
//      printarray(marks);
//       // print updated array
//      for(int i=0;i<marks.length;i++){
//         System.out.println(marks[i]);
//      }
        

//     }
// }


// import java.util.*;
// public class array{

    
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//        int  marks[]=new int[3];

//        for(int i=0;i<marks.length;i++){
//         System.out.print("Enter the marks: ");
//          marks[i]=sc.nextInt();

//         }
//       for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//       }
    
//     }
// }


//linear search
import java.util.Arrays;
public class array{

       public static int linearSearch(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
               return i;
           
        }
    }
          return -1;  // ❌ not found

       }
    public static void main(String args[]){
       int arr[]={5,3,8,1,7};
       Arrays.sort(arr);

      int result= linearSearch(arr,5,98);
      System.out.println(Arrays.toString(arr));
       if(result==-1){
        System.out.println("Element not found");
       } else {
        System.out.println("Element found at index: " + result);
    }

       
    
}
}