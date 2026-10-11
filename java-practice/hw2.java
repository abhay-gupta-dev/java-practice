import java.util.*;
public class hw2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
char choice;
        
       
      
        do { 
            System.out.print("Enter any number for factorial: ");
            int n=sc.nextInt();
            int fact=1;
            if(n==0 || n== 1){
                fact=1;
            }else{
                 for(int i=1;i<=n;i++){
            fact= fact*i;
           }
        }
        System.out.println("The factorial is "+fact);
            System.out.print("Do you want to enter another number? (Y/n): ");
            choice = sc.next().charAt(0);

             
          
        } while (choice=='y' || choice=='Y');
         

    }
    
}
