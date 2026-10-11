// public class majority_element {
//     public static int majority(int number[],int n){
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<n;j++){
//                 if(number[i]==number[j]){
//                     count++;
//                 }
//             }
//             if(count>n/2){
//                 return number[i];
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//             int number[]={2,2,1,1,1,2,2,2};
//             int n=number.length;
//             int ans=majority(number, n);
//             System.out.println(ans);

//     }
    
// }

// import java.util.Arrays;
// public class majority_element {
//     public static int majority(int number[],int n){
//         int freq=1;
//         int ans=-1;
//         for(int i=1;i<n;i++){
//             if(number[i]==number[i-1]){
//                 freq++;
//             }else{
//                 freq=1;
//                 ans=number[i];
               
//             }
//              if(freq>n/2){
//                 return ans;

//             }
           
//             }
           
//              return -1;
//         }
       
    
       
//     public static void main(String[] args) {
//             int number[]={2,2,3,3,3,2,2,2};
//             int n=number.length;
//             Arrays.sort(number);

//             int ans=majority(number, n);
//             System.out.println(ans);

//     }}


//moore's voting algorithm
import java.util.Arrays;

public class majority_element {
    public static int majority(int number[],int n){
      int freq=0,ans=0;
      for(int i=0;i<n;i++){
        if(freq==0){
            ans=number[i];
        }
        if(ans==number[i]){
            freq++;
      }else{
        freq--;
      }
    }
        
         int count=0;
        for(int val:number){
            if(val==ans){
                count++;
            }
        }
            if(count>n/2){
                return ans;
            }else{
                return -1;
            }
        
       
    }
       
    
       
    public static void main(String[] args) {
            int number[]={2,2,3,3,3,2,2,2};
            int n=number.length;
            Arrays.sort(number);

            int ans=majority(number, n);
            System.out.println(ans);

    }}
    

