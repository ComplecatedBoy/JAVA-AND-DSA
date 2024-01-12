package Stack;
import java.util.*;

public class StackByArrayList {
   private ArrayList<Integer>al=new ArrayList<>();

   int size(){
    return al.size();
   }
   boolean isEmpty(){
    return al.isEmpty();
   }

   boolean push(Integer v){
      return al.add(v);
   }

   int pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return -1;
    }
    return al.remove(al.size()-1);
   }

   int peek(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return -1;
    }
    return al.get(al.size()-1);
   }

   public static void main(String[] args) {
    StackByArrayList s=new StackByArrayList();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
    System.out.println(s.size());
   }
    
}
