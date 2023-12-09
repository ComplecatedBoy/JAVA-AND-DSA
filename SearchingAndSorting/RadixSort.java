//Radix Sort:-
//Radix Sort is a linear sorting algorithm that sorts elements by processing them digit by digit.
//It is an efficient sorting algorithm for integers or strings with fixed-size keys.

package SearchingSorting;

public class RadixSort {

    public static void countSort(int[]arr,int exp){
        int output[]=new int[arr.length];
        int count[]=new int[10];

        for (int i = 0; i < arr.length; i++)
        count[(arr[i] / exp) % 10]++;

        for(int i=1;i<10;i++){
             count[i]+=count[i-1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
    }

    public static void radixsort(int[]arr){
        int max=arr[0];
        for(int i:arr){
            max=Math.max(max,i);
        }
        System.out.println(max);
        for(int exp=1;max/exp>0;exp*=10){
            print(arr);
            countSort(arr,exp);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        radixsort(arr);
        print(arr);
    }
    public static void print (int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
