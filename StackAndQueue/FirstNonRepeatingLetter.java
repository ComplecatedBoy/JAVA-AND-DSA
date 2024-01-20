package StackAndQueue;
import java.util.*;

public class FirstNonRepeatingLetter{

    public static void solve(String str){
        Queue<Character>q=new LinkedList<>();
        int[]count=new int[256];
        for(char ch:str.toCharArray()){
            count[ch]++;
            q.add(ch);
            while(!q.isEmpty()&&count[q.peek()]>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1);
            }else
            System.out.println(q.peek());
        }
    }
    public static void main(String[] args) {
        String str="aabccxb";
        solve(str);
    }

}
