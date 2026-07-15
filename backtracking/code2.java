public class code2{
    //finding subsets of a string
    public static void findsubsets(String str,int i,StringBuilder sb){
        if(i==str.length()){
            if(sb.length()==0){
                System.out.println("null");
            }else{
                 System.out.println(sb.toString());

            }
           
            return;
        }
        //recursion calls

        //include characters
        sb.append(str.charAt(i));        
        findsubsets(str,i+1,sb);     
        
        sb.deleteCharAt(sb.length()-1); //backtracking step
        findsubsets(str,i+1,sb); //exclude characters


    }
    public static void main(String args[]){
        String str="ab";
        findsubsets(str,0,new StringBuilder(""));

    }
}