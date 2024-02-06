package Hashingg;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
       HashSet<Integer>hs=new HashSet<>();
       hs.add(1);
       hs.add(2);
       hs.add(3);
       hs.add(1);
       hs.add(3);
       hs.add(null);

       Iterator it=hs.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
    }
}
