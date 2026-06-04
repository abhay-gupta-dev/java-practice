public class mergeSortedArray {
    public static void merge(int[] num1,int m,int[] num2,int n){
        int num3[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(num1[i]<num2[j]){
                num3[k]=num1[i];
                i++;
            }else{
                num3[k]=num2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            num3[k]=num1[i];
            i++;
            k++;
        }
        while(j<n){
            num3[k]=num2[j];
            j++;
            k++;
        }
       for(i=0;i<m+n;i++){
          num1[i]=num3[i];
       }
    }
  public static void main(String[] args){
    int num1[] = {1,2,3,0,0,0};
    int num2[] = {2,5,6};
    int m=3;
    int n=3;
    merge(num1,m,num2,n);
    for(int i=0;i<m+n;i++){
        System.out.print(num1[i]+" ");
    }
  }
}