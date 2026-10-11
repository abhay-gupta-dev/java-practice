import java.util.HashSet;

public class pattern2 {

    // Longest substring without repeating characters
    public static void printsubstring(String str) {

        int maxlength = 0;
        int start=0;
        int end=0;

        for (int i = 0; i < str.length(); i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < str.length(); j++) {

                if (set.contains(str.charAt(j))) {
                    break;
                }

                set.add(str.charAt(j));

               if(maxlength<j-i+1){
                maxlength=j-i+1;
                  start=i;
                end=j;
               }
              
            }
        }

         System.out.println("Longest substring length: " + maxlength);
             System.out.print("Longest substring: ");
        for (int i = start; i <= end; i++) {
            System.out.print(str.charAt(i));
        }
    

    }

    public static void main(String args[]) {

        String str = "abcabcbb";

       printsubstring(str);

       
    }
}