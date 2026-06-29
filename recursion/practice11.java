public class practice11{
    //reversing the string through recursion
    public static void reverseString(String str,int idx){
         //base case
        //  while(idx>=0){
        //     System.out.print(str.charAt(idx));
        //     idx--;
        //  }
        if(idx<0){
            return;
        }
         System.out.print(str.charAt(idx));
         reverseString(str,idx-1);

    }
   
    public static void main(String args[]){
        String str="abcd";
         reverseString( str,str.length()-1);



    }
}