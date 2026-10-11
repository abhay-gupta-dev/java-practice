public class buynsellstock {
    public static int buynsellstock(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int n=price.length;
        for(int i=0;i<n;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyprice=price[i];
            }

        }
          return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int profit=buynsellstock(price);
        System.out.println("maximum profit is: "+profit);
        
        
    }
    
}
