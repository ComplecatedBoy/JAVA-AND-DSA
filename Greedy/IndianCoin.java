package Greedy;

import java.util.ArrayList;

public class IndianCoin {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,200,500,2000};

        int count=0;
        ArrayList<Integer>ans=new ArrayList<>();
        
        int i=coins.length-1;
        int amount=1059;

        while(i>=0&&amount>0){
            if(coins[i]<=amount){
                amount -=coins[i];
                ans.add(coins[i]);
                count++;
            }else{
                i--;
            }
        }   

        System.out.println(count);
        System.out.println(ans);
    }
  


}
