package StackAndQueue;
import java.util.*;

public class InterLeaveQueue {

    public static Queue<Integer> interLeave(Queue<Integer>q1){
        int i=0;
        int n=q1.size();
        Queue<Integer>q2=new LinkedList<>();
        while(i<n/2){
            q2.add(q1.remove());
            i++;
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
        return q1;
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        interLeave(q);
        System.out.println(q);
    }
}
