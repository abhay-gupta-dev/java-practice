public class mergesort{
    public static void mergeSort(String str[],int low,int high){
        if(low>=high){
            return;

        }
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(str,low,mid);
            mergeSort(str,mid+1,high);
            merge(str,low,mid,high);
        }

    }
    public static void merge(String str[],int low,int mid,int high){
        String temp[]=new String[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(str[i].compareTo(str[j])<0){
                temp[k]=str[i];
                i++;

            }else{
                temp[k]=str[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=str[i++];
        }
        while(j<=high){
            temp[k++]=str[j++];
        }
        for(k=0,i=low;k<temp.length;k++,i++){
            str[i]=temp[k];
        }


    }
    public static void main(String[] args){
        String str[]={"sun", "earth", "mars", "mercury"};
        mergeSort(str,0,str.length-1);
        for(String ans:str){
            System.out.print(ans + " ");
        }


    }
}