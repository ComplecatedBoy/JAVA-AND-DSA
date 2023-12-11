package SearchingSorting;
import java.util.*;

public class CostToMakeArrElementsEqual {
    public static int findCost(int[]arr){
        Arrays.sort(arr);
        int res=0;

        if(arr.length%2==1)
        res=arr[arr.length/2];
        else{
            res=(arr[arr.length/2]+arr[(arr.length-2)/2])/2;
        }
        return computeCost(arr,res);
    }
    public static int computeCost(int[]arr,int res){
        int cost=0;
        for(int i:arr){
            cost+=Math.abs(i-res);
        }
        return cost;
    }

    public static int findCost2(int[]arr){

        int low=arr[0];
        int high=arr[0];

        for(int n:arr){
            if(low>n)low=n;
            if(high<n)high=n;
        }

        while(high-low>2){
           int mid1=low+(high-low)/3;
           int mid2=high-(high-low)/3;

           int cost1=computeCost(arr,mid1);
           int cost2=computeCost(arr,mid2);
           if(cost1<cost2)high=mid2;
           else low=mid1;
        }
        return computeCost(arr,(high+low)/2);
    }


    public static void main(String[] args) {
        int[]arr={1,100,101,22,938};
        System.out.println(findCost(arr));
        System.out.println(findCost2(arr));
    }
}
