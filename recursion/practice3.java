public class practice3{
    public static String removeDuplicates(String str,int idx,StringBuilder newstr,boolean[] map){
        //base case
        if(idx==str.length()){
            return  newstr.toString();
        }
        char ch=str.charAt(idx);
        if(map[ch-'a']==true){
            return removeDuplicates(str, idx+1,newstr,map);
        }else{
            map[ch - 'a'] = true;
              return removeDuplicates(str, idx+1,newstr.append(ch),map);


        }
    }
    public static void main(String args[]){
 String str = "aabbccab";
 System.out.println(removeDuplicates(str, 0,new StringBuilder(""),new boolean[26]));
    }
}