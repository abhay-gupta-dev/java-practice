import java.util.*;
public class Greedy_Selection{
    //this is when the ending array is sorted
    public static void main(String args[]){
       // code here
          int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        
        //add first activity
         maxAct=1;
        ans.add(0);
        int lastEnd=finish[0];
        for(int i=1;i<finish.length;i++){
            if(start[i]>=lastEnd){
                ans.add(i);
                maxAct++;
                lastEnd=finish[i];
            }
        }
        System.out.println("maximum activity: "+maxAct);
        System.out.println("[");
          for(int i=0;i<ans.size();i++){
           System.out.println("A"+ans.get(i)+",");
          }
           System.out.println("]");
    }
}