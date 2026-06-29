public class practice13 {
    public static void moveallx(String str,int idx,int count,String newstr){
        //base case
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;

        }
        char currchar=str.charAt(idx);
        if(currchar=='x'){
            moveallx(str,idx+1,count+1,newstr);
        }else{
            moveallx(str,idx+1,count,newstr+currchar);

        }
    }
    public static void main(String args[]){
         String str = "axbcxxd";
         moveallx(str,0,0,"");

    }
    
}
