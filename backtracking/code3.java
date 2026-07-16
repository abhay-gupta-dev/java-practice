public class code3{
    public static void findpermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr,ans+currchar);
        }
    }
    public static void main(String args[]){
        String str="abc";
        findpermutation(str,"");

    }
}