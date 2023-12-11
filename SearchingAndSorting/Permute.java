package SearchingSorting;

import java.util.Arrays;
import java.util.Collections;

public class Permute {
    public static void main(String[] args) {
       Integer[] arr1={ 3, 3, 3, 4 };
       Integer[]arr2={1, 2, 2, 1};
       int k=10;

       Arrays.sort(arr1);
       Arrays.sort(arr2,Collections.reverseOrder());
       for (int index = 0; index < arr1.length; index++) {
         if((arr1[index]+arr2[index])<k){
            System.out.println(false);
            return;
         }
       }
       System.out.println(true);
    }
}
