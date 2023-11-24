package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PrintDuplicateCharacters {
    public static void main(String[]args){
        String str="test string";
        int[]freq=new int[26];

       LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')continue;
            freq[str.charAt(i)-'a']++;

            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        System.out.println("_____________________________________");
        System.out.println("_____________________________________");

        for(int i=0;i<26;i++){
            if(freq[i]<=1)continue;
            System.out.println("Character :"+(char)( i+'a')+" frequency :"+freq[i]);
        }

        System.out.println("____________________________________");
        System.out.println("_____________________________________");

        boolean[]printed=new boolean[26];

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '||printed[str.charAt(i)-'a']||freq[str.charAt(i)-'a']<=1)continue;
            System.out.println("Character :"+str.charAt(i)+" frequency :"+freq[str.charAt(i)-'a']);
            printed[str.charAt(i)-'a']=true;
        }

        System.out.println("____________________________________");
        System.out.println("_____________________________________");
        System.out.println(map);

        for(Character k:map.keySet()){
            if(map.get(k)<=1)continue;
            System.out.println("Character :"+k+" frequency :"+map.get(k));
        }
    }
}
