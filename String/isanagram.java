package String;
import java.util.*;

public class isanagram {

    public static boolean isana(String s,String t){
        ArrayList<Character>al=new ArrayList<Character>();
        // al.add('j');
        // al.add('j');
        // al.add('j');
        // al.add('j');
        // System.out.println(al.size());
        // String sku ="satyam";
        // String kus="s";
      
       
        // System.out.println( sku.indexOf(kus));
        if(s.length()!=t.length()){
            return false;
        }
        char []arr1=new char[s.length()];
        char []arr2=new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr1[i]=s.charAt(i);
            arr2[i]=t.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i]!=arr2[i])return false;

        }
        return true;
    }
    public static void main(String[] args) {
        String str="anagram";
        String  str2="nagaram";
        System.out.println(isana(str,str2));
    }
    
}




