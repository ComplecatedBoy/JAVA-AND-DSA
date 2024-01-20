package StackAndQueue;
import java.util.*;

public class StackByDeque {
    
    public static class Stack {
        Deque<Integer>dq=new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void push(int v){
            dq.addLast(v);
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return dq.removeLast();
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
           return dq.peekLast();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(5);
        s.push(6);
        s.push(7);

        System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.println(s.pop());
            System.out.println(s.peek());
        }

        System.out.println(s.pop());
    }
}
