package HeapsPriorityQueues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[]={11,2,3,22,3,4,6,2,7,6,1,9,10};
        int k=3;
        int res[]=new int[arr.length-k+1];
        PriorityQueue<Integer>pq=new PriorityQueue<>(k,Comparator.reverseOrder());
        int i=0;
        for ( i = 0; i< k; i++) {
            pq.add(arr[i]);
        }
        while(pq.size()==k){
            res[i-k]=pq.peek();
            pq.remove(arr[i-k]);
            if(i<arr.length){
                pq.add(arr[i]);
                i++;
            }
        }

        for (int  val : res) {
            System.out.print(val+" ");
        }


    }
}
