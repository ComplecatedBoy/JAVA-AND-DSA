package Hashingg;
import java.util.*;

public class UnionInterSection{
    public static void main(String[] args) {
       int  arr1[]={7,3,9};
       int arr2[]={6,3,9,2,9,4};
       Set<Integer>set=new HashSet<>();

       for (int  val : arr1) {
        set.add(val);
       }
       for(int val:arr2){
        set.add(val);
       }
       System.out.println("Union "+set.size());
       set.clear();
       int intersection=0;
       for(int val:arr1){
          set.add(val);
       }
       for (int val : arr2) {
        if(set.contains(val)){
            intersection++;
            set.remove(val);
        }
       }
       System.out.println("InterSection "+intersection);
    }
}