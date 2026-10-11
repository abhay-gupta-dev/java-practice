public class kedans {
    public static void printmaxSubarraySum(int number[],int n){
        int maxSum=Integer.MIN_VALUE;
      int currsum=0;
      for(int i=0;i<n;i++){
        currsum +=number[i];
        if(currsum<0){
            currsum=0;
        }
        if(currsum>maxSum){
            maxSum=currsum;
        }
      }
      System.out.println("the max sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int number[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=number.length;
        printmaxSubarraySum(number,n);
        
    }
}
