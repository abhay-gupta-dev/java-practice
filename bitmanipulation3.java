public class bitmanipulation3 {
    public static int hammingweight(int n){
        int count=0;
        while(n!=0){
            if(n%2!=0){
                count++;
            }
            n=n/2;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=11;
        System.out.println(hammingweight(n));   
    }
       
    
}