// public class pairsum {
//     public static void pairsum(int number[],int n,int target){
//         for(int i=0;i<n;i++){
//             int curr=number[i];
//             for(int j=i+1;j<n;j++){
//                 if(curr+number[j]==target){
//                     System.out.println("pair is: "+curr+" and "+number[j]);
//                 }else if(curr+number[j]>target){
//                     break;
//                 }

//             }
//         }
        

//     }
//     public static void main(String[] args) {
//         int number[]={2,4,6,8,10};
//         int target=14;
//         int n=number.length;
//         pairsum(number, n, target);

        
//     }
// }
public class pairsum {
    public static void pairsum(int number[],int n,int target){
       
        int i=0,j=n-1;            //two pointer approach
        boolean found=false;
        while(i<j){
            int psum=number[i]+number[j];
            if(psum>target){
                j--;
            }else if(psum<target){
                i++;
            }else{
                System.out.println("the pair is: "+"("+number[i]+","+number[j]+")");
               
                found=true;
                i++;
                j--;
            
        }

        
    }
     if (!found) {
            System.out.println("No pair found! sorry");
        }
    

    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        int target=18;
        int n=number.length;
        pairsum(number, n, target);

        
    }
}