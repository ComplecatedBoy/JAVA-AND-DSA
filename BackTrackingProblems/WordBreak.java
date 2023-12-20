package BackTrackingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {


    public static void wordbreakutil(List<String>dict,String str,int length,int index,List<String>ans){
        if (index==length) {
            for (String s : ans) {
                System.out.print(s+" ");
            }
            System.out.println();
            return;
        }
         for(int i=index+1;i<=length;i++){
             String cur=str.substring(index, i); 
             if(dict.contains(cur)){
             ans.add(cur);
             wordbreakutil(dict,str,length,i,ans);
             ans.remove(cur);
             }
             
         }
    }

     public static void wordbreak(List<String>dict,String str,int length){
        List<String>ans=new ArrayList<>();
        wordbreakutil(dict,str,length,0,ans);
     }


         
    public static void main(String[] args) {
        String s="iloveicecreamandmango";
        System.out.println(s.length());

         
        List<String>dict=Arrays.asList("mobile","samsung","sam","sung",
                                      "man","mango", "icecream","and",
                                      "go","i","love","ice","cream","like");
        
        wordbreak(dict,s,s.length());
        
    }
}
