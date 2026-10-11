import java.util.Scanner;
public class java2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number for how many lines of star you want to print: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
