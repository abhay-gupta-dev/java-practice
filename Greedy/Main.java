import java.util.*;

public class Main {
  public static double fractional_knapsack(int val[], int weight[], int W, int n) {
    double ratio[][] = new double[n][2];
    for (int i = 0; i < n; i++) {
      ratio[i][0] = i;
      ratio[i][1] = val[i] / (double) weight[i];
    }
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    int capacity = W;
    double finalValue = 0;
    for (int i = n - 1; i >= 0; i--) {
      int idx = (int) ratio[i][0];
      if (capacity >= weight[idx]) {
        finalValue += val[idx];
        capacity -= weight[idx];
      } else {
        finalValue += ratio[i][1] * capacity;
        break;
      }
    }
    return finalValue;
  }
  
    public static void main(String[] args) {
         int val[] = {60, 100, 120};
        int weight[]= {10, 20, 30};
        int W=50; //capacity
        int n=val.length;
        double value = fractional_knapsack(val, weight, W, n);
        System.out.println(value);
     
    }
}