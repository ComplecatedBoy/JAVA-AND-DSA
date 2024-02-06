package HeapsPriorityQueues;
import java.util.*;

public class ConnectNropes {
    public static void main(String[] args) {
         int[]ropes={2,3,3,4,6};
         PriorityQueue<Integer>pq=new PriorityQueue<>();
         for(int val:ropes)
         pq.add(val);
         int cost=0;
         while(pq.size()>1){
             int newrope=pq.remove()+pq.remove();
             cost+=newrope;
             pq.add(newrope);
         }
         System.out.println(cost);

    }
}
