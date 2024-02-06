package Hashingg;

import java.util.*;
public class LargestContiguousSubarray {

    public static int findLength(int[]arr){
        int length=1;

        for(int i=0;i<arr.length;i++){
            HashSet<Integer>hs=new HashSet<>();

            int max=arr[i];
            int min=arr[i];
            hs.add(arr[i]);

            for(int j=i+1;j<arr.length;j++){
                if(hs.contains(arr[j]))break;

                min=Math.min(min, arr[j]);
                max=Math.max(max,arr[j]);
                hs.add(arr[j]);
                if((max-min) == (j-i)){
                   length=Math.max(length, j-i+1);
                }
            }    
        }
        return length;
    }





    public static void main (String[] args)
    {
    //    int arr[] =  {10, 12, 12, 10, 10, 11, 10};
       int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
       System.out.println("Length of the longest contiguous subarray is " +
                           findLength(arr));
    
    }
    
}
