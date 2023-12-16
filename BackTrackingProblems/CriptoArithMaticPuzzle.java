package BackTrackingProblems;

import java.util.*;

public class CriptoArithMaticPuzzle {

    public static int getNum(String str,HashMap<Character,Integer>map){
        String num="";
        for(int i=0;i<str.length();i++){
            num+=map.get(str.charAt(i));
        }
        return Integer.parseInt(num);
    }

    public static void solve(String unique,int idx,HashMap<Character,Integer>map,boolean[]usedDigit,String str1,String str2,String str3){
        if(idx==unique.length()){
            int num1=getNum(str1,map);
            int num2=getNum(str2,map);
            int num3=getNum(str3,map);
            if(num1+num2==num3){
               System.out.println(map);
            }
            return;
        }
        for(int i=0;i<10;i++){
            if(!usedDigit[i]){
                usedDigit[i]=true;
                map.put(unique.charAt(idx),i);
                solve(unique, idx+1, map, usedDigit, str1, str2, str3);
                usedDigit[i]=false;
                map.put(unique.charAt(idx),-1);
            }
        }
    }

    public static void criptArithMaticPuzzle(String str1,String str2,String str3){
        HashMap<Character,Integer>map=new HashMap<>();
        String unique="";
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,-1);
                unique+=ch;
            }
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,-1);
                unique+=ch;
            }
        }
        for(int i=0;i<str3.length();i++){
            char ch=str3.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,-1);
                unique+=ch;
            }
        }
        
        boolean[]usedDigit=new boolean[10];


        solve(unique,0,map,usedDigit,str1,str2,str3);
    }
   public static void main(String[] args) {
    String str1="SEND";
    String str2="MORE";
    String str3="MONEY";
    criptArithMaticPuzzle(str1,str2,str3);
   }
}
