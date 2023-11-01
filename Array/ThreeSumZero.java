package array;
import java.util.*;

public class ThreeSumZero {
    public static List<List<Integer>> Find (int arr[])
    {
        List<List<Integer>> al= new ArrayList<>();
        Arrays.sort(arr);
        int start,end;
        int temp;

        for(int i=0;i<arr.length-2;i++){
            temp=arr[i]*-1;
            if( i>0&&arr[i]==arr[i-1]){
                i++;
            }
            
            start=i+1;end=arr.length-1;
            while(start<end){
              

                if(arr[end]+arr[start]==temp)
                {    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[start]);
                    triplet.add(arr[end]);
                    al.add(triplet);
                    start++;
                    end--;
                
                }

                else if(arr[end]+arr[start]<temp)
                start++;
                else
                 end--;
            }
            
           
        }
         return al;
    }

    public static void main(String []args){
        int arr[]={-6,2,4,-5,12,-6};
        System.out.print(Find(arr));
    }
    
}
