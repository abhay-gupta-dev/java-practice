import java.util.*;
public class code6 {
    //next smaller element right side
    public static int [] nextSmaller(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[]={4,5,2,10,8};
       int result[]=nextSmaller(arr);
       for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
       }
      
    }

    
}
