package StackAndQueue;
import java.util.*;

public class ConnectRopes {

    public static int getCost(int[]arr){
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int i:arr){
            q.add(i);
        }
        int cost=0;
        while(q.size()>1){
            int first=q.remove();
            int second=q.remove();
            cost=cost+first+second;
            q.add(first+second);
        }

        return cost;
    }
    public static void main(String[] args) {
        int ropes[]={4,3,2,6};
        System.out.println(getCost(ropes));
    }
}
