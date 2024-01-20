package StackAndQueue;
import java.util.*;

public class SortTheStack {

    public static void insert(Stack<Integer>s,int val){
        if(s.isEmpty()||s.peek()<val){
            s.push(val);
            return;
        }
        int top=s.pop();
        insert(s,val);
        s.push(top);
    }

    public static void sort(Stack<Integer>s){
        if(s.isEmpty())return;
        int val=s.pop();
        sort(s);
        insert(s,val);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(6);
        s.push(8);
        s.push(5);
        s.push(1);
        s.push(9);
        sort(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    
}
