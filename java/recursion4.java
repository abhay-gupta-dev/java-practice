public class recursion4{
    public static void printfebonacci(int a,int b,int n){
        if(n==0){
        return;
        }
        int c=a+b;
        System.out.println(c);
        printfebonacci(b,c,n-1);
        

    }


    public static void main(String[] args) {
        int a=0,b=1;
        int n=8;
        System.out.println(a);
        System.out.println(b);
        printfebonacci(a,b,n-2);
        
    }
}