package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaxLengthOfChain {
    static class  pair {
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static void main(String[] args) {
        ArrayList<pair>pairs=new ArrayList<>();
        pairs.add(new pair(5, 24));
        pairs.add(new pair(39, 60));
        pairs.add(new pair(5, 28));
        pairs.add(new pair(27, 40));
        pairs.add(new pair(50, 90));

        Collections.sort(pairs,Comparator.comparing(o->o.second));

        int length=0;
        ArrayList<pair>ans=new ArrayList<>();
        int last=-1;

        for(pair p:pairs){
            if(p.first>last){
                length++;
                ans.add(p);
                last=p.second;
            }
        }

        System.out.println(length);
        for(pair p:ans){
            System.out.print("("+p.first+","+p.second+")");
        }

    }
}
