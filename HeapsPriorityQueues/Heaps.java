package HeapsPriorityQueues;

import java.util.*;

public class Heaps {
    static class Heap{
       ArrayList<Integer>arr=new ArrayList<>();

       boolean isEmpty(){
        return arr.isEmpty();
       }

       int peek(){
        if(isEmpty())return Integer.MIN_VALUE;
        return arr.get(0);
       }
       
       void add(int data){
        arr.add(data);
        int x=arr.size()-1;
        int par=(x-1)/2;
        while(x!=0 && arr.get(x)<arr.get(par)){
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
            x=par;
            par=(x-1)/2;
        }
       }

       private void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int idx=i;
        if(left<arr.size()&&arr.get(idx)>arr.get(left)){
          idx=left;
        }
        if(right<arr.size()&&arr.get(idx)>arr.get(right)){
            idx=right;
        }
        if(idx!=i){
            int temp=arr.get(i);
            arr.set(i,arr.get(idx));
            arr.set(idx,temp);
            heapify(idx);
        }
       }

       int remove(){
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int data=arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
        heapify(0);
        return data;
       }
       void PrintHeap(){
        System.out.println(arr);
       }

    }
    
    public static void main (String[]rom){
        Heap hp=new Heap();
        hp.add(4);
        hp.add(3);
        hp.add(5);
        hp.add(2);
        hp.add(10);
        hp.add(1);
        hp.add(6);
        hp.add(9);
        hp.add(8);
        hp.add(7);

        while (!hp.isEmpty()) {
            System.out.print(hp.peek()+" ");
            hp.remove();
        }
        

    }
    
}
