package String;
import java.util.*;

public class groupanagrams { 
    public static List<List<String>> groupana(String [] strs){
           List<List<String>> ans = new ArrayList<>();
            List<String> list = new ArrayList<>();

            int n = strs.length;

            for(int i = 0; i <n ; i++){
                String s = strs[i];
                s=sort(s);
                System.out.println(s);
                
                if (!list.contains(s)) {
                    list.add(s);
                    List<String> newans=new ArrayList<>();
                    newans.add(strs[i]);
                    ans.add(newans);
                 }
                 else {
                    int index=list.indexOf(s);
                    ans.get(index).add(strs[i]);
                 }
       
              }

        return ans;
    }
       public static void main(String[] args) {
        String []strs={"cat","bat","ata","atc","tab","taa"};

        System.out.println(groupana(strs));
       }
         
    

    // public  static String sort(String s){
    //     char[] t = s.toCharArray();
    //     Arrays.sort(t);
    //     return new String(t);
    // }

    public static String sort(String s){
         char[]t = s.toCharArray();
         Arrays.sort(t);
        return new String(t);
    }


}