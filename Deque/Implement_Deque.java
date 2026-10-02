import java.util.Deque;
import java.util.LinkedList;
public class Implement_Deque{
    public static void impDeque(Deque<Integer>d){
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        while(!d.isEmpty()){
            System.out.println(d.getLast());
            d.removeLast();
        }
    }
    public static void main(String args[]){
        Deque<Integer>d=new LinkedList<>();  
        impDeque(d);
 
    }
}