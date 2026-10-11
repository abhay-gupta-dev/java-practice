import java.util.*;
public class binarysearch {

    public static int binarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,7,3,2,4,9,29};
        Arrays.sort(arr);
        int key=90;
        int result=binarySearch(arr,key);
        System.out.println(Arrays.toString(arr));
       if(result==-1){
        System.out.println("element not found.");
       }else{
        System.out.println("found at index "+result);
       }

        
    }
    
}
