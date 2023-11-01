package array;

public class MaxProfitStock {

    public static void maxprofit(int arr[]){
        int maxprofit=0;
        int buyprice =arr[0];

        for(int i=1;i<arr.length;i++){
           maxprofit=Math.max(maxprofit,(arr[i]-buyprice));
           buyprice=Math.min(arr[i],buyprice);
        }

       System.out.println(maxprofit);
    }
    public static void main (String args[]){
        int prices[]={1,1,5,6,4};
        maxprofit(prices);
    }
    
}
