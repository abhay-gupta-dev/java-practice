import java.util.*;
public class Three_sum{
    //brute force approach
    public static List<List<Integer>> three_sum(int nums[],int n){
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                      List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
                       Collections.sort(temp);
                    if(!ans.contains(temp)){
                        ans.add(temp);
                    }
                    }
                   
                }
            }
        }
       return ans;

    }
    public static void main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4};
        int n=nums.length;
       
        List<List<Integer>>result= three_sum(nums,n);
        System.out.println(result);
    }
}