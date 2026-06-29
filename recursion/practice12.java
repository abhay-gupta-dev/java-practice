public class practice12{
    public static int first=-1;
    public static int last=-1;
    public static void findOccurances(String str,int idx,char element){
        //base case
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
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
        findOccurances(str,idx+1,element);

    }
    public static void main(String args[]){
          String str = "abaacdaefaah";

       findOccurances(str, 0, 'a');

    }
}