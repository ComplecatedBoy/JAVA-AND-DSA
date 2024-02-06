package Hashingg;

import java.util.*;

public class SurpasserCount {
    public static void merge(int[] arr, int l, int m, int r, Map<Integer, Integer> hm) {
        int n1 = m - l + 1;
        int n2 = r - m;
        /* create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];
         
        /* Copy data to temp arrays L[] and R[] */
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
         
        /* Merge the temp arrays back into arr[l..r]*/
        int i = 0, j = 0, k = l;
        int c = 0;
          
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                // increment inversion count of L[i]
                hm.put(L[i], hm.getOrDefault(L[i], 0) + c);
                arr[k++] = L[i++];
            } else {
                // inversion found
                arr[k++] = R[j++];
                c++;
            }
        }
         
        /* Copy the remaining elements of L[], if
        there are any */
        while (i < n1) {
            hm.put(L[i], hm.getOrDefault(L[i], 0) + c);
            arr[k++] = L[i++];
        }
        /* Copy the remaining elements of R[], if
        there are any */
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }


    public static void mergeSort(int[] arr, int l, int r, Map<Integer, Integer> hm) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m, hm);
            mergeSort(arr, m + 1, r, hm);
            merge(arr, l, m, r, hm);
        }
    }

    public static void findSurpasser(int[] arr,int n)
    {
        // To store inversion count for elements
        Map<Integer, Integer> hm = new HashMap<>();
         
        // To store copy of array
        int[] dup = arr.clone();
         
        // Sort the copy and store inversion count
        // for each element.
        mergeSort(dup, 0, n - 1, hm);
 
        System.out.println("Surpasser Count of array is: ");
        for (int i = 0; i < n; i++) {
            if(hm.containsKey(arr[i]))
            System.out.print((n - 1) - i - hm.get(arr[i]) + " ");
            else
            System.out.print((n - 1) - i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int[] arr = {2, 7, 5, 3, 0, 8, 1};
        int n = arr.length;
 
        System.out.println("Given array is: " + Arrays.toString(arr));
 
        findSurpasser(arr, n);
    }
}
