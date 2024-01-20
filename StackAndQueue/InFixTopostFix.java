package StackAndQueue;

import java.util.*;

public class InFixTopostFix{

    public static int precedence(char ch){
        switch (ch) {
            case '^':
                return 3;
            case '/':
                 return 2;
            case '*':
                 return 2;
            case '+':
                 return 1;
            case '-':
                 return 1;
            default:
                 return -1;
        }
    }
    public static char associativity(char ch){
        if(ch=='^'){
            return 'R';
        }
        return 'L';
    }

    public static String toPostFix(String str){
        Stack<Character>s=new Stack<>();
        StringBuilder ans=new StringBuilder("");

        for(char ch : str.toCharArray()){
            if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                ans.append(ch);
            }else if(ch=='('){
                s.push('(');
            }else if(ch==')'){
                while(!s.isEmpty()&&s.peek()!='('){
                    ans.append(s.pop());
                }
                s.pop();
            }else{
                while (!s.isEmpty()&& (precedence(ch)<precedence(s.peek())||(precedence(ch)==precedence(s.peek())&& ( associativity(ch)=='L' ))) ) {
                    ans.append(s.pop());
                }
                s.push(ch);
            }
        }
        while(!s.isEmpty()){
            ans.append(s.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String str="(a+b)+b*c+(b-c)^(2+c)";
        System.out.println(toPostFix(str));
    }
}