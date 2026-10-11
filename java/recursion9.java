public class recursion8{
    public static int countelstr(String str, char ch,int idx){
        if(idx==str.length()){
            return 0;
        }
       int count=(str.charAt(idx)==ch)?1:0;
         return count+countelstr(str,ch,idx+1);
        

        

        
    }
    public static void main(String args[]){
        
       String str="banana";
       char ch='a';
      int result= countelstr(str,ch,0);
      System.out.println("The count of "+ ch +" in the string is: "+ result);

    }
}