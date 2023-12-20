package BackTrackingProblems;

public class equalpartition {
       
    public static boolean canwepart(int[]arr,int N, int index,int Total,int currsum){
        if (currsum==Total/2 &&  Total%currsum==0) {
            return true;
        }
        if (index<N) {
            if (canwepart(arr, N, index+1, Total, currsum)==true) {
                return true;
            }
            if (canwepart(arr, N, index+1, Total, currsum+arr[index])==true) {
                return true;
            }
        }
        return false;
    }




   public static boolean equalPartition(int N, int arr[])
    {    int total=0;
        for (int num : arr) {
            total+=num;
        }
       int currsum=0;
        return canwepart(arr,N,0,total,currsum);
    }
    public static void main(String[] args) {
        int[]arr={1,5,5,11};
        int N=arr.length;
        // if(equalPartition(N, arr))
        if(canEqualPartition(N,arr))
        System.out.println("YES");
        else System.out.println("No");
    }

    public static boolean canEqualPartition(int N,int[]arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        if(sum%2==1)return false;
        return isPossible(0,arr,sum/2);
    }

    public static boolean isPossible(int index,int[]arr,int sum){
        if(sum==0)return true;
        if(sum<0||index==arr.length)return false;
        return isPossible(index+1,arr,sum-arr[index])||isPossible(index+1,arr,sum);
    }

}
