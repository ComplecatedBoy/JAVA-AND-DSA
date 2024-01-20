package StackAndQueue;

import java.util.*;

public class QueueByDeque {

    public static class Queue{

        Deque<Integer>dq=new LinkedList<>();
        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int v){
            dq.addFirst(v);
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.removeLast();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.peekLast();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(3);
        q.add(2);
        q.add(5);
        q.add(6);
        q.add(0);

        System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println(q.remove());
    }
}
