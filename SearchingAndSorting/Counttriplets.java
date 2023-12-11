package SearchingSorting;
import java.util.*;

public class Counttriplets {
    public static int getcount(int[]arr,int sum){
        int ans=0;
       Arrays.sort(arr);
       for(int k =0;k<arr.length-2;k++){
         int i=k+1;
         int j=arr.length-1;
        
        while(i<j){
            if (arr[k]+arr[i]+arr[j]<sum) {
                ans=ans+j-i;
                i++;
            }else{
                  j--;
            }
            }
        }
       
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-2, 0, 1, 3};
        System.out.println(getcount(arr,2));

    }
}
