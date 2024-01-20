package StackAndQueue;
import java.util.*;

public class DequeInJCF{
    public static void main(String args[]){
        Deque<Integer>dq=new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addFirst(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq);
        System.out.println(dq.removeLast());
        System.out.println(dq);
    }
}
