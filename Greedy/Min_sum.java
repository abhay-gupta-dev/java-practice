import java.util.*;
public class Min_sum{
  //we are finding minimum absolute difference sum
  public static int Min_absolutedeffsum(int A[],int B[]){
    Arrays.sort(A);
    Arrays.sort(B);
    int minDiff=0;
    for(int i=0;i<A.length;i++){
      minDiff+=Math.abs(A[i]-B[i]);
    }
    return minDiff;
  }
  public static void main(String args[]){
    int A[]={4,5,2,6,1};
    int B[]={1,9,3,5,2};
    int result=Min_absolutedeffsum(A,B);
    System.out.println(result);

  }
}