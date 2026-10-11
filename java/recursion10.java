public class recursion10{
    public static int first=-1;
        public static int last=-1;
    public static void findoccurance(String str,int idx,char element){
        
        if(idx==str.length()){
            System.out.println("First occurance at index: "+ first);
            System.out.println("Last occurance at index: "+ last);
            return;
        }


        char currchar=str.charAt(idx);
        if(currchar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findoccurance(str,idx+1,element);

 }

 
    public static void main(String args[]){
        String str="abcaadefaah";
        char element='a';
        findoccurance(str,0,'a');
       
    }
}