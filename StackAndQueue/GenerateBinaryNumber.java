package StackAndQueue;

import java.util.*;

public class GenerateBinaryNumber {

    public static void generate(int n){
        Queue<String>q=new LinkedList<>();
        q.add("1");

        while(n-->0){
            String s1=q.remove();
            System.out.print(s1+" ");
            q.add(s1+"0");
            q.add(s1+"1");
        }

    }
    public static void main(String[] args) {
        int n=10;
        generate(n);
    }
}
