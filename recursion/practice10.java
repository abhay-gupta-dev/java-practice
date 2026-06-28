public class practice10{
    public static void towerofhanoi(int n,String src,String helper,String dest){
        //base case
        if(n==1){
            System.out.println("transfer the disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerofhanoi( n-1,src, dest,helper);
        System.out.println("transfer the disk "+n+" from "+src+" to "+dest);
        towerofhanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]){
        towerofhanoi(3,"s","h","d");

    }
}