package Hashingg;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
            int[]arr={1,3,2,5,1,3,1,5,1};
    Map<Integer,Integer>map=new HashMap<>();

    for(int val:arr){
        // if(map.containsKey(val)){
        //     map.put(val,map.get(val)+1);
        // }else
        // map.put(val, 1);
        map.put(val,map.getOrDefault(val,0)+1);
    }
    for(Integer key: map.keySet()){
          if(map.get(key)>arr.length/3){
            System.out.println(key);
          }
    }
    // for (Map.Entry<Integer,Integer> e: map.entrySet()){
    //     if(e.getValue()>arr.length/3){
    //         System.out.println(e.getKey()+" ");
    //     }
    // }
    }
}
