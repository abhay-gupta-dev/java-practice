import java.util.*;
public class Indian_coins {
    //indian coins we have 1,2,5,10,20,50,100,200,500,2000
    public static int indianCoins(Integer coins[],int amount){
        //we have to solve it through greedy approach so that we can take the maximum value coin
        //  first and then we can take the next maximum value coin and so on
      
        int count=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                while(amount>=coins[i]){
                       count++;
                        ans.add(coins[i]);
                         amount-=coins[i];
               
                

                }
            }
        }
        System.out.println(ans);
        return count;
    }
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
        int amount=3453;
          Arrays.sort(coins, Comparator.reverseOrder());
         int count=indianCoins(coins,amount);
         System.out.println(count);

    }
    
}
