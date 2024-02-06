package Hashingg;
import java.util.*;

public class ShiftedString {
    public static String getString(String s){
        String key="";
        for(int i=0;i<s.length()-1;i++){
            int dif=s.charAt(i+1)-s.charAt(i);
            if(dif<0)dif+=26;
            key+=(char)dif+'a';
        }
        return key;
    }

    

    public static void getShiftedStrings(String[]str){
       Map<String,LinkedList<String>>map=new HashMap<>();
        for(String s:str){
           String key=getString(s);
           if(!map.containsKey(key)){
            LinkedList<String>ll=new LinkedList<>();
            ll.add(s);
            map.put(key, ll);
           }else{
            LinkedList<String>ll=map.get(key);
            ll.add(s);
            map.put(key, ll);
           }
           
        }

        for(String key:map.keySet()){

            for(String s:map.get(key)){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String[] str = { "acd", "dfg", "wyz", "yab", "mop", "bdfh", "a", "x", "moqs" };
        getShiftedStrings(str);
    }
}
