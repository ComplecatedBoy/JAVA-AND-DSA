package array;


public class MaxSumArr2 {
    public static int  MaxSumSA(int arr[]) {
       int CurrSum = arr[0];
       int maxsum = arr[0];

       for(int i=1;i<arr.length;i++){

         CurrSum=Math.max(CurrSum+arr[i],arr[i]);
         maxsum= Math.max(CurrSum, maxsum);

        }
       return maxsum;
    }
    public static void main(String args[]){
        int num[]={1,0,0,1};
       System.out.println(MaxSumSA(num));
    }
}


