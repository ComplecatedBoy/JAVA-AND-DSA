package SearchingSorting;

import java.util.Arrays;

public class Findfourelements {
    public static void main(String[] args) {
        int[]arr={1, 4, 45, 6, 10, 12};
        Arrays.sort(arr);

        int i=0;
        int j,k,l;
        int sum=21;

       for ( i = 0; i < arr.length-3; i++) {
           for(j=i+1;j<arr.length-2;j++){
                  k=j+1;
                  l=arr.length-1;
                  while (k<l) {
                    if (arr[i]+arr[j]+arr[k]+arr[l]==sum) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
                        k++;l--;
                    }else if (arr[i]+arr[j]+arr[k]+arr[l]<sum )k++;
                    else l--;
                  }
           }
            
       }
    }
}
