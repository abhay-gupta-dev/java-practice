public class practice6 {
    public static void find_Occurances(int arr[],int key,int i){
        //finding the given key at the indices
        //brute force approach
        // for( i=0;i<arr.length;i++){
        //     if(arr[i]==key){
        //         System.out.print(i+" ");
        //     }
        // }
        //through recursion
        
        //base case
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        find_Occurances(arr,key,i+1);
    }
    public static void main(String[] args){
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        find_Occurances(arr,key,0);

    }
    
}
