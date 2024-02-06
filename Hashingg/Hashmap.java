package Hashingg;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        //put(key,value)---------------O(1)
        hm.put("India",145);
        hm.put("China",144);
        hm.put("US",75);

        System.out.println(hm);

        //get(key)-----------O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("US"));

        //containsKey(key)---------O(1)
        System.out.println(hm.containsKey("Indonasia"));
        System.out.println(hm.containsKey("China"));

        //remove(key)------O(1)
        System.out.println(hm);
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.remove("Bhutan"));
        System.out.println(hm);

        //size()------------O(1)
        System.out.println(hm.size());

        //clear()-------O(1)
        hm.clear();
        System.out.println(hm);

        //hm.isEmpty()------O(1)
        System.out.println(hm.isEmpty());

        //Iteration over Hashmap...............
        //keySet()-----------------O(1)
        hm.put("China",144);
        hm.put("India",145);
        hm.put("US",75);
        hm.put("Bhutan",5);
        hm.put("japan",5);

        Set<String>keys=hm.keySet();
        for (String key : keys) {
            System.out.println(key+" "+hm.get(key));
        }

        //entrySet()------O(1)
        Set<Map.Entry<String,Integer>>entries=hm.entrySet();
        for (Map.Entry<String,Integer> e : entries) {
             System.out.println(e.getKey()+" "+e.getValue());
        }

        ArrayList<Integer>arr=new ArrayList<>(hm.values());
        System.out.println(arr);
        

    }
}
