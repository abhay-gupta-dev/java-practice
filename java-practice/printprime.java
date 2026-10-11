import java.util.*;
public class printprime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=2;i<=Math.sqrt(n);i++){
          
                while(n%i==0){
                    arr.add(i);
                    n /=i;
                
               


            }
           
        }
          if(n!=1){
                arr.add(n);
            }
        System.out.println("The array is: \n"+ arr);

    }
    
}
