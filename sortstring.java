import java.util.Arrays;
public class sortstring{
    public static String[] mergeSort(String[] arr,int l,int h){
        if(l==h){
          String A[]={arr[l]};
          return A;
        }
        int mid=l+(h-l)/2;
        String[]str1=mergeSort(arr,l,mid);
        String[]str2=mergeSort(arr,mid+1,h);

        String[] str3=merge(str1,str2);
        return str3;
    }

    public static String[] merge(String[] str1, String[] str2){
        String[] str3=new String[str1.length+str2.length];
        int i=0,j=0,k=0;
        while(i<str1.length && j<str2.length){
            if(str1[i].compareTo(str2[j])<0){
                str3[k]=str1[i];
                i++;
            }else{
                str3[k]=str2[j];
                j++;
            }
            k++;
        }
        while(i<str1.length){
            str3[k]=str1[i];
            i++;
            k++;
        }
        while(j<str2.length){
            str3[k]=str2[j];
            j++;
            k++;
        }
return str3;
    }
    public static void main(String[] args){
        String [] arr= {"sun","earth","mars","mercury"};
        String a[]=mergeSort(arr,0,arr.length-1);
      
            System.out.println(Arrays.toString(a));
     

    }
}