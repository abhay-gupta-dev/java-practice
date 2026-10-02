import java.util.*;
public class Maximum_chainlength {
    //maximum length of chain of pairs
    public static void main(String args[]){
        int pairs[][]={{5,24},{15,25},{27,40},{50,60}};
        int n=pairs.length;
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainlength=1;
        int lastend=pairs[0][1];
        for(int i=1;i<n;i++){
            if(pairs[i][0]>lastend){
                chainlength++;
                lastend=pairs[i][1];
            }
        }
        System.out.println(chainlength);
    }
    
}
