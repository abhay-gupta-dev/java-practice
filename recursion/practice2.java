public class practice2 {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //findig total ways
        int fnm1=tilingProblem(n-1);     //for vertical check
       int fnm2=tilingProblem(n-2);      //for horizontal check
        int totalways=fnm1+fnm2;
        return totalways;

    }
    public static void main(String[] args){
        System.out.println(tilingProblem(3));

    }
    
}
