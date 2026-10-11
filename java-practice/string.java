// import java.util.*;
// public class string {   
// public static void printstringpalidrome(String str){
//     String reverse="";
//     for(int i=str.length()-1;i>=0;i--){
//         reverse=reverse+str.charAt(i);
//     }
//     if(str.equals(reverse)){
//         System.out.println("palindrome");
//     }else{
//         System.out.println("not palindrome");
//     }
    


// }
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// String str=sc.next();
// printstringpalidrome(str);
// }
// }



import java.util.*;
public class string {   
public static boolean printstringpalidrome(String str){
   for(int i=0;i<str.length()/2;i++){
    if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        return false;
    }

   }
   return true;

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
boolean result=printstringpalidrome(str);
System.err.println("result: " + result);

}
}