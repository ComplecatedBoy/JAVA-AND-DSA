package Stack;

import java.util.*;

public class ReverseString {

    public static String reverse(String str){
        Stack<Character>s=new Stack<>();
        for(Character ch:str.toCharArray()){
            s.push(ch);
        }
        StringBuffer ans=new StringBuffer();
        while(!s.isEmpty()){
            ans.append(s.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str="SatyamKumarShah";
        System.out.println(reverse(str));
    }
}
