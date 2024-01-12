package Stack;
import java.util.*;

public class DuplicateParenthessis {
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();
        for(char ch:str.toCharArray()){
              if(ch==')'){
                int count=0;
                while(s.pop()!='('){
                    count++;
                } 
                if(count<1)
                return true;
              }else{
                s.push(ch);
              }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str2="(a+b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
