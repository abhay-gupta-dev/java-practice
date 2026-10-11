import java.util.*;
public class divisible {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    ArrayList<Long> arr = new ArrayList<>();
    for(long i=1;i<=Math.sqrt(n);i++){
        if(n%i==0){
            arr.add(i);
            if(n/i !=i){
                arr.add(n/i);
             }
    }
}
    System.out.println("the array is "+ arr);
        
    }
   }
