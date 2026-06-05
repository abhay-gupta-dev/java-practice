public class majorityelement{
    public static int majority(int arr[]){
        int element=arr[0];
        // int count=0;
        // for(int num:arr){
        //     if(count==0){
        //         element=num;
        //     }
        //     if(num==element){
        //         count++;
        //     }else{
        //         count--;
        //     }
        // }
        // return element;
        // }


        //brute force approach
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                
            }
        }
            if(count>arr.length/2){
                return arr[i];
            }
        }
       return -1;

        }
     
    public static void main(String[] args){
        int arr[]={2,2,1,1,1,2,2};
        int ans=majority(arr);
        System.out.println(ans);

    }
}