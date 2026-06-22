import java.math.BigInteger;

public class bitmanipulation {
    public static void oddoreven(   int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n,int i,int newbit){
        n=clearIthBit(n,i);
        int bitmask=newbit<<i;
        return n | bitmask;
    }
    public static int clearbitinrange(int n,int i,int j){
        int a=~0<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static int powerof2(int n){
        return (n&(n-1))==0?1:0;
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static long fastexponentiation(long a,long n){
        long ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static BigInteger fastPower(BigInteger a, long n) {
    BigInteger ans = BigInteger.ONE;

    while (n > 0) {
        if ((n & 1) == 1) {
            ans = ans.multiply(a);
        }

        a = a.multiply(a);
        n >>= 1;
    }

    return ans;
}

    public static void main(String[] args){
        // System.out.println(getIthBit(10,2));
        // System.out.println(setIthBit(10,2));
        // System.out.println(clearIthBit(10,1));
        // System.out.println(updateIthBit(10,1,0));
        System.out.println(clearbitinrange(10,2,4));
         System.out.println(powerof2(16));
            System.out.println(countsetbits(234));
            System.out.println(fastexponentiation(2,10));
            System.out.println(fastPower(BigInteger.valueOf(3), 12));
        
    }
   
    }
    
