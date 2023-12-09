package SearchingSorting;

public class AggressiveCow {
    public static boolean isPossible(int[]arr,int i,int C){
        int last=Integer.MIN_VALUE;
        for(int num:arr){
            if(last+i<=num){
                C--;
                last=num;
            }
            if(C<=0)return true;
        }
        return false;
    }
    public static int minimunDistance(int[]arr,int N,int C){
        int high=arr[N-1]-arr[0];
        int low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(arr, mid, C)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low-1;
    }
    public static void main(String[] args) {
        int[]arr={2,3,7,9,10,15,16,25,100};
        int C=5;
        System.out.println(minimunDistance(arr,arr.length, C));
    }
}
