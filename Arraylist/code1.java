import java.util.ArrayList;
public class code1{
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(3);
        list.add(3,4);
        list.set(2,10);
        System.out.println(list.get(2));
        System.out.println(list.contains(10));
            }
}