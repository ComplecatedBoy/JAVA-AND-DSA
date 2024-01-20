package StackAndQueue;
import java.util.*;

public class SpecialStackGetMin {
    // static class SpecialStack {
    //     Stack<Integer>s=new Stack<>();
    //     int min=-1;
    //     int dummyVal=9999;

    //     void push(int v){
    //         if(min==-1)
    //             min=v;
    //         else 
    //             min=Math.min(v,min);
    //         v=v*dummyVal+min;
    //         s.push(v);
    //     }

    //     int pop(){
    //         if(s.isEmpty()){
    //             System.out.println("Stack is Empty");
    //             return -1;
    //         }
    //         int v=s.pop();
    //         return v/dummyVal;
    //     }

    //     int getMin(){
    //         if(s.isEmpty()){
    //             System.out.println("Stack is Empty");
    //             return -1;
    //         }
    //         int v=s.peek();
    //         return v%dummyVal;
    //     } 
    // }
    static class SpecialStack {
        Stack<Integer>s=new Stack<>();
        Stack<Integer>helper=new Stack<>();

        void push(int v){
            s.push(v);
            if(helper.isEmpty()){
                helper.push(v);
            }else{
                helper.push(Math.min(helper.peek(),v));
            }
        }

        int pop(){
            if(s.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            helper.pop();
            return s.pop();
        }

        int getMin(){
            if(s.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return helper.peek();
        } 
    }
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack(); 
  
        int[] arr = { 3, 2, 6, 1, 8, 5, 5, 5, 5 }; 
  
        for (int i = 0; i < arr.length; i++) { 
            s.push(arr[i]); 
            System.out.println(s.getMin());
        } 
        System.out.println(); 
        for (int i = 0; i < arr.length; i++) { 
            s.pop(); 
            System.out.println(s.getMin());
        } 
    }
}
