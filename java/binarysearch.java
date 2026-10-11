import java.util.*;
public class binarysearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + high / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {

                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {

        int arr[] = {9,5,2,7,4,0};
        Arrays.sort(arr);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");

        }
        
        System.out.println("Enter the value of target.");
        int n=sc.nextInt();
        
        

        int result = binarySearch(arr, n);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
