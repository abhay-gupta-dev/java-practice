import java.util.*;
public class Jobsequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String args[]){
      int jobInfo[][]={{4,20},{3,10},{6,40},{1,30}};
      ArrayList<Job>jobs=new ArrayList<>();
      for(int i=0;i<jobInfo.length;i++){
        jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
      }
      Collections.sort(jobs,(a,b)->b.profit-a.profit);
      int count=0;
      int totalprofit=0;
      ArrayList<Integer>seq=new ArrayList<>();
      for(int i=0;i<jobInfo.length;i++){
        Job curr=jobs.get(i);
        if(curr.deadline>count){
          seq.add(curr.id);
          count++;
          totalprofit+=curr.profit;
        }
      }
   
      System.out.println("Max size: "+seq.size());
      System.out.println("Max profit: "+totalprofit);
      System.out.println("Sequence: ");
      for(int i=0;i<seq.size();i++){
        System.out.println(seq.get(i)+" ");

      }
      System.out.println();

        
    }
    
}
