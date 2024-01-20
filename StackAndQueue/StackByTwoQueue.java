package StackAndQueue;
import java.util.*;

public class StackByTwoQueue {

    static class Stack{
        Queue<Integer>q1;
        Queue<Integer>q2;

        Stack(){
            q1=new LinkedList<>();
            q2=new LinkedList<>();
        }

        boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        void push(int v){
            if(q1.isEmpty()){
                q2.add(v);
            }else{
                q1.add(v);
            }
        }

        int pop(){
            int val=-1;
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return val;
            }

            if(q1.isEmpty()){
                while(!q2.isEmpty()){
                    val=q2.remove();
                    if(q2.isEmpty())break;
                    q1.add(val);
                }
            }else{
                while(!q1.isEmpty()){
                    val=q1.remove();
                    if(q1.isEmpty())break;
                    q2.add(val);
                }
            }
            return val;
        }

        int peek(){
            int val=-1;
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return val;
            }

            if(q1.isEmpty()){
                while(!q2.isEmpty()){
                    val=q2.remove();
                    q1.add(val);
                }
            }else{
                while(!q1.isEmpty()){
                    val=q1.remove();
                    q2.add(val);
                }
            }
            return val;
        }
        
    }


    public static void main(String[] args) {
        Stack q=new Stack();
        q.push(2);
        q.push(1);
        q.push(5);
        q.push(3);
        q.push(6);
        q.push(7);

        while(!q.isEmpty()){
            System.out.println(q.pop()+" "+q.peek());

        }
        q.pop();
    }
}
