package Hashingg;
import java.util.*;

public class LargestSubarraySum {
    public static void main(String[] args) {
        int[]arr={15,-2,2,-8,1,7,10,23};
        Integer sum=0;
        int length=0;
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.println(sum);
            System.out.println(map);
            if(map.containsKey(sum)){
                System.out.println(map.get(sum));
                length=Math.max(length,i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
          System.out.println(length);
    }
}
