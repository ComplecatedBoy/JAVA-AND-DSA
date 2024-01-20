package StackAndQueue;
import java.util.*;

public class ValidParenThesis {

    public static boolean isValid(String str){
        Stack<Character>s=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{
                if(!(s.peek()<ch&&s.peek()+3>=ch)){
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str="({[[(}{})]})";
        String str2="{([({()(){}[{([]())}]})])}()[{}]";
        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}
