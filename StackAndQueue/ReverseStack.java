package StackAndQueue;
import java.util.Stack;

public class ReverseStack {
    public static void pushAtbottom(Stack<Integer>s,Integer v){
        if(s.isEmpty()){
         s.push(v);
         return;
        }
        Integer cur=s.pop();
        pushAtbottom(s, v);
        s.push(cur);
     }

     public static void reverse(Stack<Integer>s){
        if(s.isEmpty())return;
        int val=s.pop();
        reverse(s);
        pushAtbottom(s,val);
     }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
