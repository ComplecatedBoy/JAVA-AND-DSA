package SearchingSorting;

public class Cieling {
    public static int getcieling(int[]arr,int k){

        if (k<=arr[0]) {
            return arr[0];
        }

       int low=0;int high=arr.length-1;

       for (int index = low; index < high; index++) {
           if (k==arr[index]) {
            return arr[index];
           }

           if (k>arr[index]&&k<=arr[index+1]) {
            return arr[index+1];
           }

       }


        return -1;
    }

    public static int linearSol(int[]arr,int k){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
             
             if(arr[i]>=k)ans=Math.min(ans,arr[i]);
        }
        return ans;
    }
    public static int BinarySol(int[]arr,int k,int start,int end){
        if(start>end||arr[end]<k)return -1;
        int mid=(start+end)/2;
        if(arr[mid]==k)return arr[mid];
        if(arr[mid]<k&&arr[mid+1]>=k)return arr[mid+1];
        if(arr[mid]>k){
            return BinarySol(arr, k, start, mid);
        }else{
            return BinarySol(arr, k, mid, end);
        }
    }
    public static void main(String[] args) {
        int [] arr = { 1,5,9,22,25,31,40};
        System.out.println(getcieling(arr,21));
        System.out.println(linearSol(arr, 21));
        System.out.println(BinarySol(arr, 21, 0,arr.length-1));

    }
}
