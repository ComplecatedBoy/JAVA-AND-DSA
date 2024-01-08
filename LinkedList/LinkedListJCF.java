package LinkedList;
import java.util.LinkedList;

public class LinkedListJCF {
    public static void main(String[] args) {
        LinkedList<Integer>ll= new LinkedList<>();
        System.out.println(ll.size());
        ll.addFirst(3);
        ll.addLast(2);
        System.out.println(ll);
    }
    
}
