public class quicksort {
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        if(si<ei){
             //finding the pivot element
        int pidx=partition(arr,si,ei);
        //sort the left part
        quickSort(arr,si,pidx-1);
        //sort the right part
        quickSort(arr,pidx+1,ei);


        }
       

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        //swap pivot
        i++;
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }

    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
