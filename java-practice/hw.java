import java.util.*;
public class hw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;

        char choice;
        do{
            System.out.print("Enter the number: ");
            int num=sc.nextInt();
            if(num%2==0){
                evensum +=num;
            }else{
                oddsum +=num;
            }
            System.out.println("do you want another number to enter?(Y/n)");
            choice=sc.next().charAt(0);

        }while(choice=='Y'|| choice=='y');
      
            System.out.println("The final evensum is: "+ evensum);
            System.out.println("The final oddsum is: "+ oddsum);
        }
        
    }
    

