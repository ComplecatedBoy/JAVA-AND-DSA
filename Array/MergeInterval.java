package array;

import java.util.*;

public class MergeInterval {
        public static void Merge(int[][] arr){

           List<List<Integer>> al =new ArrayList<List<Integer>>();
           Arrays.sort(arr, new Comparator<int[]>(){
                public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
                }
           });

           int a=arr[0][0],b=arr[0][1];
           for (int j = 1; j < arr.length; j++){
               
               if( arr[j][0]<=b){
                 b=Math.max(b,arr[j][1]);

               }else{
                List<Integer>child=new ArrayList<Integer>(2);
                child.add(a);
                child.add(b);
                al.add(child);
                a=arr[j][0];
                b=arr[j][1];
               }
               
               if(  j == arr.length-1){ 
                List<Integer>child=new ArrayList<Integer>(2);
                child.add(a);
                child.add(b);
                al.add(child);
               }
            }

            System.out.println(al);
           
          
          }
           
        
        

    public static void main(String[] args) {
        int nums[][]={{6,8},{1,9},{2,4},{4,7}};
        Merge(nums);
    }
    
}
//Half way.