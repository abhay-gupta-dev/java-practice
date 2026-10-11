public class dectobin {
    public static void dectobin(int n){
        int mynum=n;
        int binNum=0 ,pow=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary number of "+mynum+" is "+binNum);
    }
    public static void main(String[] args) {
        dectobin(16);
        
    }
    
}
