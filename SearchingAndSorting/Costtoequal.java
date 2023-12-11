package SearchingSorting;

import array2D.setzeroes;

public class Costtoequal {

    public static int computeCost(int[]arr,int k){
        int ans=0;
        for (int index = 0; index < arr.length; index++) {
            ans+=Math.abs(arr[index]-k);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr={1,100,101};
        int high,low;
        high=low=arr[0];
        
        for (int index = 0; index < arr.length; index++) {
            if(low>arr[index]){
                low=arr[index];
            }
            if(high<arr[index]){
                high=arr[index]+1;
            }
        }
        low=low-1;
        System.out.println(low+" "+high);
          for(int i=low;i<=high;i++){
               if (i%10==0) {
                System.out.println();
                }
            System.out.print(computeCost(arr, i)+" ");
         
        }
        while(high-low>2){
          int mid1= low+(high-low)/3;
          int mid2= high-(high-low)/3;

          int cost1=computeCost(arr, mid1);
          int cost2=computeCost(arr, mid2);
          if(cost1<cost2)high=mid2;
          else low=mid1;
          System.out.println(low+" "+high);
        }


        System.out.println(computeCost(arr,(low+high)/2));
    }
}
