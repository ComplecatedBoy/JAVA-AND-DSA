package StackAndQueue;
import java.util.*;

public class QueueByJCF {
    public static void main(String[] args) {

        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(null);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

        Queue<Integer>q2=new ArrayDeque<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);
        q2.add(null);
        q2.add(3);
        while(!q2.isEmpty()){
            System.out.println(q2.remove());
        }
    }


}
