public class Pattern1 {
    //sliding window
    public static void  fixedWindow(int arr[],int k){
        if(k>arr.length){
            return;
        }
        int windowSum=0;
       
        for(int i=0;i<k;i++){
            windowSum +=arr[i];
        }
         int max=windowSum;
        System.out.println("windowSum is: "+windowSum);
        for(int i=k;i<arr.length;i++){
            windowSum += arr[i]-arr[i-k];
            max=Math.max(max,windowSum);
            System.out.println("windowSum is: "+windowSum);
        }
        System.out.println("Maximum sum of fixed window is: "+max);

    }
    public static void main(String[] args){
         int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        fixedWindow(arr, k);

    }
}