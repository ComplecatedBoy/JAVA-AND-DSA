package SearchingSorting;

import java.util.Arrays;

public class Radix {

    public static void countsort(int[]arr,int exp,int n){
        int output[]=new int[n];

        int count[]=new int[10];
         Arrays.fill(count,0);
          
         for(int i=0;i<arr.length;i++){
                count[(arr[i]/exp)%10]++;
         }

         for (int i = 1; i < 10; i++) {
             count[i] +=count[i-1];
         }

         for (int i = n-1; i >=0; i--) {
             output[count[(arr[i]/exp)%10]-1]=arr[i];
             count[(arr[i]/exp)%10]--;
         }
         
         for(int i =0; i<n ;i++){
            arr[i]=output[i];
         }
    }

    public static void radixsort(int[]arr){
        int mx=getmax(arr);

        for(int exp=1;mx/exp>0;exp=exp*10){
           countsort(arr,exp,arr.length);
        }

    }



    public static int getmax(int[]arr){
        int mx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx) {
                mx=arr[i];
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        int []arr={807,2,45,24,134,0,100};
        radixsort(arr);
        

        for (int i : arr) {
            System.out.print(i+" ");
        }
         System.out.println();
    }
}
