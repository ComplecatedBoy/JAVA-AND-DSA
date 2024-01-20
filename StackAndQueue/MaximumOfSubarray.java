package StackAndQueue;
import java.util.*;

public class MaximumOfSubarray {

    public static void solve(int[]arr,int k){
        Deque<Integer>dq=new LinkedList<>();
        int i=0;
        for(i=0;i<k;i++){
            while(!dq.isEmpty()&&arr[i]>=arr[dq.peekFirst()]){
                dq.removeFirst();
            }
            dq.addLast(i);
        }

        while(i<arr.length){
            System.out.println(arr[dq.peekFirst()]+" ");

            while(!dq.isEmpty()&& dq.peekFirst()<=i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty()&&arr[i]>=arr[dq.peekFirst()]){
                dq.removeFirst();
            }
            dq.addLast(i);
            i++;
        }
        System.out.println(arr[dq.peekFirst()]);
        
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,1,4,5,2,3,6};
        int k=3;
        solve(arr,k);
    }
}
