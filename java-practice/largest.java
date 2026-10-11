public class largest {
    public static int largest(int arr[],int n){
        int largest=Integer.MIN_VALUE;  // -infinity
        int smallest=Integer.MAX_VALUE;  //+infinity
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
             smallest=arr[i];
            }
        }
        System.out.println("smallest value is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={4,5,9,8,1};
        int n=arr.length;
        int result=largest(arr,n);
       System.out.println("largest value is "+result);
        
    }
    
}
