package BinarySearchTrees.ConflictingAppointment;
import java.util.*;

 class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key,V value){
        this.key=key;
        this.value=value;
    }

    K getKey(){
        return this.key;
    }

    V getValue(){
        return this.value;
    }
}

public class Main {
    public static void Print(Pair<Pair<Integer,Integer>,Pair<Integer,Integer>>P){
         System.out.println("{"+P.getKey().getKey()+","+P.getKey().getValue()+"}");
    }
    public static void main(String[] args) {
        List<List<Integer>>v=new ArrayList<>();
        v.add(Arrays.asList(1,5));
        v.add(Arrays.asList(3,7));
        v.add(Arrays.asList(2,6));
        v.add(Arrays.asList(10,15));
        v.add(Arrays.asList(5,6));
        v.add(Arrays.asList(4,10));

        int n=v.size();

        List<Pair<Pair<Integer,Integer>,Pair<Integer,Integer>>>list=new ArrayList<>();

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(v.get(i).get(0)<v.get(j).get(1)){
                    list.add(new Pair<>(
                        new Pair<>(v.get(i).get(0),v.get(i).get(1)),
                        new Pair<>(v.get(j).get(0),v.get(j).get(1))));
                        break;
                }
            }
        }

        for(Pair<Pair<Integer,Integer>,Pair<Integer,Integer>> P:list){
            System.out.print("{"+P.getKey().getKey()+","+P.getKey().getValue()+"}");
            System.out.print("conflicts with ");
            System.out.print("{"+P.getValue().getKey()+","+P.getValue().getValue()+"}");
            System.out.println();
        }

    }
}
