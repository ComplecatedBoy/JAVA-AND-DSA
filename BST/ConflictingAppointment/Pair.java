package BinarySearchTrees.ConflictingAppointment;

 public class Pair<K,V>{
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
