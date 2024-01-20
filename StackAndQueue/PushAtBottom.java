package StackAndQueue;
import java.util.*;

public class PushAtBottom {

    public static void pushAtbottom(Stack<Integer>s,Integer v){
       if(s.isEmpty()){
        s.push(v);
        return;
       }
       Integer cur=s.pop();
       pushAtbottom(s, v);
       s.push(cur);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtbottom(s,5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
