

public class  practice1 {
    public static void printDec(int n){
        //through recursion
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    static int printfact(int n){
        if(n==0){
            return 1;
        }
        //int fnm1=printfact(n-1);
        // int fn= n*fnm1;
        // return fn;
        return n* printfact(n-1);

    }
    public static void main(String[] args){
       int res= printfact(5);
        System.out.println(res);

    }
    
}
