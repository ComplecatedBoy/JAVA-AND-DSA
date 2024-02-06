package Hashingg;
import java.util.*;

public class ValidAnagram {
    public static boolean isanagram(String str1,String str2){
         Map<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str1.length();i++){
           char ch=str2.charAt(i);
           if(map.get(ch)!=null){
            if(map.get(ch)==1)map.remove(ch);
            else map.put(ch,map.get(ch)-1);
           }else return false;
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
      System.out.println(isanagram(str1,str2));
       
    }
}
