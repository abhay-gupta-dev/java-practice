public class practice4 {

    //freiends pairing problem
    public static int friendspairing(int n){
        //base case
        if(n==1 || n==2){
            return n;

        }
        //if friend remains single then number of ways
        int single=friendspairing(n-1);
        //if it wants to pair then number of ways
        int pair=(n-1)*friendspairing(n-2);
        return single+pair;
    }
    public static void main (String[] args){
        System.out.println(friendspairing(1));

    }
    
}
