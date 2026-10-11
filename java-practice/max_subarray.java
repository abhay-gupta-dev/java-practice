
public class max_subarray {

    public static void printSubarraySum(int number[],int n){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                  currSum +=number[k];
                    
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
               
            }
         
        }
        System.out.println("the max sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int number[]={5,6,3,8,9};
        int n=number.length;
        printSubarraySum(number,n);
    }
    
}
