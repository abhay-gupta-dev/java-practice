import java.util.*;
public class javabasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        int sum = ch1+ ch2;
        System.out.println("The sum of these characters is:" +sum);
    }
}