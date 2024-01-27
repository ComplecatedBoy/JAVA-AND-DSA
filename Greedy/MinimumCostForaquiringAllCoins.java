package Greedy;

// You are given a list of N coins of different denominations. You can pay an amount equivalent to any 1 coin and can acquire that coin. In addition, 
// once you have paid for a coin, we can choose at most K 
// more coins and can acquire those for free. The task is
// to find the minimum amount required to acquire all the 
// N coins for a given value of K.

// Examples : 

// Input : coin[] = {100, 20, 50, 10, 2, 5}, 
//         k = 3
// Output : 7

// Input : coin[] = {1, 2, 5, 10, 20, 50}, 
//         k = 3
// Output : 3

import java.util.*;

public class MinimumCostForaquiringAllCoins {

    public static int minimumCost(int[]cost,int n,int k){
        Arrays.sort(cost);
        int ans=0;

        for(int i=0;i<n;n-=k,i++){
            ans+=cost[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]coin={ 8, 5, 3, 10, 2, 1, 15, 25 };
        int n=coin.length;
        int k=3;
        System.out.println(minimumCost(coin,n,k)); 
    }
    
}
