package StackAndQueue;
import java.util.*;

public class ReversingKelments {

    public static void reverseK(Queue<Integer>q,int k){
        Stack<Integer>s=new Stack<>();
        int i=0;
        while(i<k){
            s.push(q.remove());
            i++;
        }
        Queue<Integer>temp=new LinkedList<>();
        while(!q.isEmpty()){
            temp.add(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while(!temp.isEmpty()){
            q.add(temp.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        for(int i:arr){
            q.add(i);
        }
        reverseK(q,5);
        System.out.println(q);
    }
}
