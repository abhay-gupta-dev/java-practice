import java.util.LinkedList;
public class ll {
    public static void main(String args[]){
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(4);
        ll.removeFirst();
        System.out.print(ll);
    }
    
}
