public class removeduplicates {
    public static int removeDuplicates(int[]nums){
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int[]temp=new int[n];
        int k=1;
      
      temp[0]=nums[0];
      for(int i=1;i<n;i++){
        if(nums[i]!=nums[i-1]){

            temp[k]=nums[i];
            k++;
        }
      }
      for(int i=0;i<k;i++){
        nums[i]=temp[i];
      }
      return k;


    }
    public static void main(String[] args){
        int[] nums={1,1,2,2,3,4,5,5};
        int k=removeDuplicates(nums);
        System.out.println("The array after removing duplicates:");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}