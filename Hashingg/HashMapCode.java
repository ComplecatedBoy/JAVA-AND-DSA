package Hashingg;
import java.util.*;

public class HashMapCode {
    static class Hashmap<K,V>{
    
    private class Node{
        K key;
        V value;
        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }

    private int  n;
    private int N=4;
    private LinkedList<Node>[] buckets;

    // @SuppressWarnings("unchecked")
    Hashmap(){
        this.n=0;
        this.buckets=new LinkedList[N];
       for(int i=0;i<buckets.length;i++){
        buckets[i]=new LinkedList<>();
       }
    }

    private int hashFunction(K key){
        int hc= key.hashCode();
        return Math.abs(hc)%buckets.length;

    }
    private int SearchInLL(K key,int bi){
        LinkedList<Node>ll=buckets[bi];

        if(ll==null)return -1;
        for(Node node:ll){
            if(node.key==key)return ll.indexOf(node);
        }
        return -1;
    }

    private void rehash(){
        LinkedList<Node>oldBuck[]=buckets;
        N=2*N;
        buckets=new LinkedList[N];
        for(int i=0;i<N;i++){
            buckets[i]=new LinkedList<>();
        }
        for(int i=0;i<oldBuck.length;i++){
             for(int j=0;j<oldBuck[i].size();i++){
                    Node node =oldBuck[i].remove();
                    put(node.key,node.value);
             }
        }
    }

    public void put(K key,V value){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);
        if(di!=-1){
            buckets[bi].get(di).value=value;
        }else{

            buckets[bi].add(new Node(key,value));
            n++;
        }
        
        double lambda=(double)n/N;
        if(lambda>2){
          rehash();
        }
    }
    public V get(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key, bi);
        if(di==-1)return null;
        return buckets[bi].get(di).value;
    }

    public boolean containsKey(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key, bi);
        if(di==-1)return false;
        return true;
    }

    public V remove(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key, bi);
        if(di==-1)return null;
        n--;
        return buckets[bi].remove(di).value;
    }

    public ArrayList<K> keySet(){
        ArrayList<K>keys=new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
            LinkedList<Node>ll=buckets[i];
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
    }
    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
    return n;
    }


    }
    public static void main(String[] args) {
        Hashmap<String,Integer>map=new Hashmap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("US",50);
        map.put("Nepal",5);

        ArrayList<String>keys=map.keySet();
        System.out.println(keys);

        System.out.println(map.get("India"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.remove("India"));
        System.out.println(map.get("India"));
        System.out.println(map.containsKey("India"));
    }
}
