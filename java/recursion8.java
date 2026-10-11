public class recursion8{
    public static void countelstr(String str, char ch,int idx){
        if(idx==str.length()){
            return;
        }
        if(str.charAt(idx)==ch){
            System.out.println("Character "+  ch +" found at index "+ idx);
            
        }
        countelstr(str,ch,idx+1);

        

        
    }
    public static void main(String args[]){
        
       String str="banana";
       char ch='a';
       countelstr(str,ch,0);

    }
}