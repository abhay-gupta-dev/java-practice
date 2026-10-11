public class string {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.setCharAt(0,'T');
          System.out.println(sb);
          sb.delete(2,3);
          System.out.println(sb);
          StringBuilder pb= new StringBuilder("H");
          pb.append('e');
          pb.append('l');
          pb.append('l');
          pb.append('o');
          System.out.println(pb);
          StringBuilder str=new StringBuilder("Abhaygupta");   //reversing an string
          for(int i=0;i<str.length()/2;i++){
            int front=i;
            int back=str.length()-1-i;
            char frontchar=str.charAt(front);
            char backchar= str.charAt(back);
            str.setCharAt(front,backchar);
            
            str.setCharAt(back,frontchar);
            

            


          }
          System.out.println(str);

    }    
}
