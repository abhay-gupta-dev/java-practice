public class practice7 {
    public static int count_Occurances(int arr[],int key,int i){
        //recursion
        //base case
        if(i==arr.length){
            return 0;
        }
      // Check if the current element is a match (1 if true, 0 if false)
        int currentMatch = (arr[i] == key) ? 1 : 0;
        int remcount=count_Occurances( arr, key, i+1);
        return currentMatch+remcount;

    }
    public static void main(String[] args){
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        int totalcount=count_Occurances( arr, key, 0);
        System.out.println(totalcount);
    }
    }