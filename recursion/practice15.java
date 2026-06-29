import java.util.HashSet;

public class practice15{
    public static void subSequences(String str,int idx,String newstr,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                   System.out.println(newstr);
                   set.add(newstr);
                   return;

            }
        }
            char currchar=str.charAt(idx);
            //include character
            subSequences(str,idx+1,newstr+currchar,set);

            //exclude character
            subSequences(str,idx+1,newstr,set);
         
        
    }
    public static void main(String[] args){
        String str="abc";
        HashSet<String>set=new HashSet<>();
        subSequences(str,0,"",set);

    }
}