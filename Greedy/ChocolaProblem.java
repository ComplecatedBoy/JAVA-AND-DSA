package Greedy;
import java.util.*;

public class ChocolaProblem {
    public static void solve(Integer []vertical,Integer horizontal[]){

        Arrays.sort(vertical,Collections.reverseOrder());
        Arrays.sort(horizontal,Collections.reverseOrder());

        int h=0;
        int v=0;

        int hp=1;
        int vp=1;

        int cost=0;

        while(v<vertical.length&&h<horizontal.length){
            if(horizontal[h]>vertical[v]){
                hp++;
                cost+=horizontal[h]*vp;
                h++;
            }else{
                vp++;
                cost+=vertical[v]*hp;
                v++;
            }
        }

        while (v<vertical.length) {
                vp++;
                cost+=vertical[v]*hp;
                v++;
        }

        while (h<horizontal.length) {
                hp++;
                cost+=horizontal[h]*vp;
                h++;
        }

        System.out.println(cost);
    }
    public static void main(String[] args) {
        Integer vertical[]={4,1,2};
        Integer horizontal[]={2,1,3,1,4};
        solve(vertical,horizontal);
    }
}
