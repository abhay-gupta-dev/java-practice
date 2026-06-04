public class inversionCount {
    //inversion count is the number of pairs in the array such that i<j and arr[i]>arr[j]
    public static int mergeSort(int arr[],int low,int high){
       if(low<high){
             int mid=low+(high-low)/2;
       int invleft= mergeSort(arr,low,mid);
       int invright=mergeSort(arr,mid+1,high);
       int invcount=merge(arr,low,mid,high);
       return invleft+invright+invcount;
       
       }
         return 0;

        
       
       
    }
    public static int merge(int arr[],int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int i=low;int j=mid+1;int k=0;
        int invcount=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];

            }else{
                temp[k++]=arr[j++];
                invcount +=mid-i+1;
            }
           
        }
         while(i<=mid){
                temp[k++]=arr[i++];
            }
            while(j<=high){
                temp[k++]=arr[j++];
            }
            for(k=0,i=low;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
        return invcount;
    }

    public static void main(String[] args){
        int arr[]={1,20,6,4,5};
        int ans=mergeSort(arr,0,arr.length-1);
        System.out.println(ans);


    }
    
}
