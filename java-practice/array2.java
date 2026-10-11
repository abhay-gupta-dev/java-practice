
// import java.util.*;
// public class array2 {
//     public static void main(String[] args) {
//          int arr[]={5,3,4,8,9};
//    int n=arr.length;
//     int arr2[]=new int[n];
//     for(int i=0;i<n;i++){
//         arr2[i]=arr[n-1-i];
        
//     }
//     System.out.println(Arrays.toString(arr2));
        
//     }
   
    
// }
public class array2 {
    public static void reversearray(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }


    }
    public static void main(String[] args) {
        int arr[]={5,3,4,8,9};
        reversearray(arr);
      
        for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
     
        }
    
    }
   
    
}
