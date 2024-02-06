package Hashingg;
import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
        // HashMap<String,Integer>map=new HashMap<>();
        map.put("India",150);
        map.put("China",100);
        map.put("US",75);
        map.put("Bhutan",13);

        // Set<String>keys=map.keySet();
        System.out.println(map);

        //Insertion order is maintain
        
    }
}
