package StackAndQueue;
import java.util.*;

public class QueueByTwoStack {
    static class Queue{
        Stack<Integer>s1;
        Stack<Integer>s2;

        Queue(){
            s1=new Stack<>();
            s2=new Stack<>();
        }

        boolean isEmpty(){
            return s1.isEmpty();
        }

        void add(int v){
            s1.push(v);
        }

        int remove(){
            int val=-1;
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return val;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            val=s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return val;
        }

        int peek(){
            int val=-1;
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return val;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            val=s2.peek();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return val;
        }
    }

    public static void main(String[] args){
        Queue q=new Queue();
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(3);
        q.add(6);
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.remove()+" "+q.peek());
        }
        q.remove();
    }

}
