public class practice14 {

    public static int substring(String str, int idx, int[] freq) {
        if(idx==str.length()){
            int ans=0;
            for(int f:freq){
                ans+=f*(f+1)/2;

            }
            return ans;
        }
        freq[str.charAt(idx)-'a']++;
        return substring(str,idx+1,freq);

       
    }

    public static void main(String[] args) {

        String str = "abcab";

        System.out.println(substring(str, 0, new int[26]));
    }
}