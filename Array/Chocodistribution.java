package array;
import java.util.*;

public class Chocodistribution{
    public static int getmindiff(int []arr,int key){
        int Min_diff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i<(arr.length-key+1) ;i++){
            if(arr[i+key-1]-arr[i]<Min_diff){
                Min_diff=arr[i+key-1]-arr[i];
            }
        }
        return Min_diff;
    }

    public static void main(String []args){
        int chocolate[]={7, 3, 2, 4, 9, 12, 56};
        int m=3;
        System.out.println("The minimum defferenc would be :"+getmindiff(chocolate,m));
    }
}