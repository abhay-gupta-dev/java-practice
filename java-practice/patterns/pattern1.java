public class pattern1{
    public static void subarray(int arr[],int k){
        // Implementation for finding subarrays
       
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum<=k){
                    int length=j-1+1;
                    maxlength=Math.max(maxlength,length);
                      System.out.print("[");
                      for(int l=i;l<=j;l++){
                        System.out.print(arr[l]);
                        if(l!=j){
                            System.out.print(",");
                        }

                      }
                      System.out.print("]");
                }


              
            }
        }
         System.out.println("Maximum length: " + maxlength);
    }
    public static int printsubarraysum(int arr[]){
        //maxmum subarray sum
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          int sum=0;
          for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            maxsum=Math.max(maxsum,sum);
          }
        }
        
        return maxsum;  
    }
    public static int maxsum(int arr[],int k){
        //by sliding window technique and we are finding the maximum sum of subarray of size k
        int l=0;
        int r=k-1;
        
        int currentsum=0;
        for(int i=0;i<k;i++){
            currentsum+=arr[i];

        }
        int maxsum=currentsum;
        while(r+1<arr.length){
            currentsum=currentsum-arr[l]+arr[r+1];
           
            maxsum=Math.max(maxsum,currentsum);
            l++;
            r++;


        }
        return maxsum;
      
 }
 public static void maxsum2(int arr[],int k){
    // through sliding window finding the longest subarray with sum less than or equal to k
    int l=0;
    int r=0;
    int sum=0;
    int maxlength=0;

     // Store start and end of the maximum subarray
    int start = 0;
    int end = 0;

    while(r<arr.length){
        
       sum+=arr[r];
       while(sum>k){
        sum-=arr[l];
        l++;
       }
     
       if(r-l+1>maxlength){
        maxlength=r-l+1;
          start=l;
        end=r;

       }
      
        r++;
       
    }
    System.out.println("Maximum length of subarray with sum less than or equal to " + k + ": " + maxlength);
    System.out.print("Subarray: [");
    for(int i=start;i<=end;i++){
        System.out.print(arr[i]);
        if(i<end){
            System.out.print(",");
        }
    }
    System.out.print("]");

 }

    public static void main(String args[]){
        int arr[]={1,4,4,5,6,7,8,9,10};
        int k=14;
        maxsum2(arr,k);
      
       // System.out.println("Maximum sum of subarray of size " + k + ": " + maxsum(arr,k));
       
       // System.out.println("Maximum subarray sum: " + printsubarraysum(arr));
    }
}