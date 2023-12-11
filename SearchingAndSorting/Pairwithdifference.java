package SearchingSorting;

import java.util.Arrays;

public class Pairwithdifference {
      public static void printpair(int[]arr,int k){
        Arrays.sort(arr);
        int i=0;int j=arr.length-1;
        while (i<j) {
            if(arr[i]+arr[j]==k){
                System.out.println("("+arr[i]+","+arr[j]+")");
                i++;
                j--;
            }else if(arr[i]+arr[j]<k){
                i++;
            }
            else j--;}
      }

    public static void main(String[] args) {
        int[] arr={3,5,4,6,7,9,2,1,8,9,4};
        printpair(arr,10);
    }
}
