package SearchingSorting;
import java.util.*;

public class Agressivecow {
    public static boolean CanBeplaced(int[]arr,int i,int k){
         int count=1;
         int last=arr[0];

        for(int j=1;j<arr.length;j++){
            if((arr[j]-last)<i)j++;
            else{
                last=arr[j];
                count++;
                if(count>=k)
                 return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr={2,3,7,9,10,15,16,25,100};
        int N=arr.length;
        int nocow=5;
        int ans=1;


       int high=arr[N-1]-arr[0];;
       System.out.println(high);

       for(int i=1;i<=high;i++){
            if(CanBeplaced(arr,i,nocow)){
                ans=i;
            }
       }
      System.out.println(ans);

    }
}
