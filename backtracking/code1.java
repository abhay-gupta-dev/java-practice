public class code1{
    public static void writenumbers(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printarray(arr);
            return;

        }
        //recursion
        arr[i]=val;
        writenumbers(arr,i+1,val+1);
        //backtracking step
        arr[i]=arr[i]-2;

    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        writenumbers(arr,0,1);
        printarray(arr);
    }
}