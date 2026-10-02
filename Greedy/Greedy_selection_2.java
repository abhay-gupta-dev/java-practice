import java.util.*;
public class Greedy_selection_2{
    //this is when the ending array is not sorted
    public static void main(String args[]){
       // code here
          int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};      //here if ending index is unsorted
        int activities[][]=new int[finish.length][3];
        for(int i=0;i<activities.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=finish[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        
        //add first activity
         maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<finish.length;i++){
            if(activities[i][1]>=lastEnd){
                ans.add(activities[i][0]);
                maxAct++;
                lastEnd=activities[i][2];
            }
        }
        System.out.println("maximum activity: "+maxAct);
        System.out.println("[");
          for(int i=0;i<ans.size();i++){
           System.out.println("A"+ans.get(i)+" ");
          }
           System.out.println("]");
    }
}