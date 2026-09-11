import java.util.*;
public class max_AreaInHistogram {
    //finding the maximum area in histogram
    public static void maxArea(int arr[],int n){
        int maxArea=0;
        int []nsr=new int[n];
        int []nsl=new int[n];
        //find next smaller right
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;

            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //find next smaller left
        s=new Stack<>();
         for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;

            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //find current maximum area
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("max area in histogram is "+maxArea);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        maxArea(arr,n);
    }
    
}
