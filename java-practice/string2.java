// public class string2 {
//     public static float printshortestdistance(String path){
//         int x=0,y=0;
//         for(int i=0;i<path.length();i++){
//             char dir=path.charAt(i);
//             //north
//             if(dir=='N'){
//                 y++;
//             }
//             //south
//             else if(dir=='S'){
//                 y--;
//             }
//             //east
//             else if(dir=='E'){
//                 x++;
//         }
//         //west
//         else{
//             x--;
//         }
       

//     }
//      int x2=x*x;
//         int y2=y*y;
//         return (float)Math.sqrt(x2+y2);

// }
//     public static void main(String[] args) {
//         String path="WNEEESNNNNEEEESSEEWW";
//         float result=printshortestdistance(path);
//         System.out.println("result: " + result);
//     }
    
// }


// public class string2 {
//        public static void main(String[] args) {
//        String[]fruits={"apple","banana","grapes"};
//        String largest=fruits[0];
//        for(int i=0;i<fruits.length;i++){
//         if(largest.compareToIgnoreCase(fruits[i])<0){
//             largest=fruits[i];
//         }
//        }
//        System.out.println("largest: " + largest);
//     }
    
// }


// public class string2 {
//        public static void main(String[] args) {
//       StringBuilder sb=new StringBuilder("");
//       for(char ch='A';ch<='Z';ch++){
//         sb.append(ch+" ");
//       }
//       System.out.println(sb);
//     }
    
// }


//string letter uppercase

// public class string2{
//     public static void toUpperCase(String str){
//         StringBuilder sb=new StringBuilder("");
//         char ch=Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
                
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         System.out.println(sb.toString());

//     }
//     public static void main(String[] args) {
//         String str="hello world";
//         toUpperCase(str);
        
        
//     }
// }


public class string2{
    public static void printPalindrome(String str){
      int left=0;
      int right=str.length()-1;
      boolean isPalindrome=true;
      while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
            isPalindrome=false;
            break;
        }else{
            left++;
            right--;
        }
      }
      if(isPalindrome){
        System.out.println(str + " is a palindrome.");
      }else{
        System.out.println(str + " is not a palindrome.");
      }

    }
    public static void main(String[] args) {
        String str="mallika sherawat";
            printPalindrome(str);
            
        
    }
}