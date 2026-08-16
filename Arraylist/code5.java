import java.util.ArrayList;
public class code5 {
    public static void pairsum(ArrayList<Integer>list,int target){
        //brute force approach
    //  for(int i=0;i<list.size();i++){
    //     for(int j=i+1;j<list.size();j++){
    //        if(list.get(i)+list.get(j)==target){
    //         System.out.println("("+list.get(i)+ ","+list.get(j)+")");
    //         }
    //     }
    //  }

    //two pointer approach
    int lp=0;
    int rp=list.size()-1;
    boolean found=false;
    while(lp<rp){
        if(list.get(lp)+list.get(rp)==target){
            System.out.println("("+list.get(lp)+ ","+list.get(rp)+")");
            found=true;
            lp++;
            rp--;

        }else if(list.get(lp)+list.get(rp)<target){
            lp++;
        }else{
            rp--;
    }
}
    if(!found){
            System.out.println("no pair found");
    }
}
    
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=5;
    pairsum(list,target);
    }
}