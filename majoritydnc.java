public class majoritydnc {
    //divide and conquer approach
    public static int majorityelement(int arr[]){
        return majority(arr,0,arr.length-1);

    }
    public static int majority(int arr[],int low,int high){
        if(low==high){
            return arr[low];
        }
        int mid=low+(high-low)/2;
        int leftmajority=majority(arr,low,mid);
        int rightmajority=majority(arr,mid+1,high);
        if(leftmajority==rightmajority){
            return leftmajority;
        }
      int leftcount=count(arr,leftmajority,low,high);
      int rightcount=count(arr,rightmajority,low,high);
      return leftcount>rightcount?leftmajority:rightmajority;

      
    }
    public static int count(int arr[],int target,int low,int high){
        int count=0;
        for(int i=low;i<=high;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={2,2,1,1,1,2,2};
        int ans=majorityelement(arr);
        System.out.println(ans);

    }
    

    
}
