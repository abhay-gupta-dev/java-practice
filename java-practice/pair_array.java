public class pair_array {
    public static void printPairs(int number[],int n){
        int tp=0;   //total count
        for(int i=0;i<n;i++){
            int curr=number[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+ ","+number[j]+")"+" ");
                tp++;
            }
            System.out.println();

        }
        System.out.println("the total count is: "+tp);

    }
    public static void main(String[] args) {
        int number[]={4,5,7,8,10};
        int n=number.length;
        printPairs(number,n);
        
        
    }
    
}
