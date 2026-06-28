public class practice9 {
    public static int printlengthofstring(String str){
        if(str.equals("")){
            return 0;
        }
        return 1+printlengthofstring( str.substring(1));

    }
    public static void main(String[] args){
        String str="hello";
        int len=printlengthofstring(str);

        System.out.println("the length of string is: "+len);

    }
    
}
