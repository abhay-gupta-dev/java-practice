public class maxsubarraysum2 {
    public static void printSubarraySum(int number[],int n){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[n];
        prefix[0]=number[0];
        for(int i=1;i<n;i++){                    //calculating prefix sum
            prefix[i]=prefix[i-1]+number[i];
        }
        //calculating subarray sum and max sum
        for(int i=0;i<n;i++){         //start index
            for(int j=i;j<n;j++){        //end index
                currSum=0;
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("the max sum is: "+maxSum);

      
       
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        int n=number.length;
        printSubarraySum(number,n);
        
    }
    
}
