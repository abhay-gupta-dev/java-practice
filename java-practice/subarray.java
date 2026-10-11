public class subarray {

    public static void printSubarray(int number[],int n){
        int tc=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                    
                }
                tc++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total count is: "+tc);
    }
    public static void main(String[] args) {
        int number[]={5,6,3,8,9};
        int n=number.length;
        printSubarray(number,n);
    }
    
}
