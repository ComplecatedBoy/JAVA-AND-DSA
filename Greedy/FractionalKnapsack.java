package Greedy;
import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int val[]={60,100,120};
        int W=50;

        double ratio[][]=new double[weight.length][2];
        for(int i=0;i<weight.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparing(o->o[1]));

        int profit=0;
        for(int i=weight.length-1;i>=0&&W>0;i--){
            int idx=(int)ratio[i][0];
            System.out.println(idx);
            if(weight[idx]<=W){
                W-=weight[idx];
                profit+=val[idx];
            }else{
                profit+=ratio[i][1]*W;
                W=0;
            }
        }

        System.out.println(profit);
    }
}
