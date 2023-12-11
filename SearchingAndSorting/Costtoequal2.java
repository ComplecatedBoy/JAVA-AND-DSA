package SearchingSorting;

public class Costtoequal2 {
    public static int computeCost(int[]arr,int k){
        int ans=0;
        for (int index = 0; index < arr.length; index++) {
            ans+=Math.abs(arr[index]-k);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,100,101};
        int digit;
        int n = arr.length;
        if(n%2==1){
            digit=arr[n/2];
        }else{
            digit=(arr[n/2]+arr[(n-2)/2])/2;

        }
        System.out.println(computeCost(arr, digit));
    }
}
