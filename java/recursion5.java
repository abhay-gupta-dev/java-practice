 public class recursion5{              //for stack hight =n
    public static int calpow(int x,int n ){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
    

        int calnm1=calpow(x,n-1);
        int calxton=x*calnm1;
        return calxton;


    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calpow(x,n);
        System.out.println(ans);
        
    }

}