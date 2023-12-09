package SearchingSorting;
import java.util.*;

public class CheckReversingSubArrSort {


    public static void reverse(int[]arr,int x,int y){
        while(x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }

    //O(n)
    public static boolean linearSol(int[]arr){
        int x=-1;
        int y=-1;

        for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
            if(x==-1)x=i;
            y=i+1;
           }
        }

        if(x==-1)return true;

        reverse(arr,x,y);
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])return false;
        }

        return true;
    }

    //O(n*lon(n))
    public static boolean methodSort(int[]arr){
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        int front=0;
        int back=arr.length-1;
        Arrays.sort(temp);
        for(front=0;front<arr.length;front++){
            if(arr[front]!=temp[front])break;
        }
        for(back=arr.length-1;back>=0;back--){
            if(arr[back]!=temp[back])break;
        }
        while(back>front&&arr[front]>arr[front+1]){
            front++;
        }
        return front==back;
    }


    public static void main(String[] args) {
        int arr[]=
        // {10,20,30,40,4,3,2,50,60,70};
        // {1,2,4,5,3};
        {};
        
        // System.out.println(methodSort(arr));
        System.out.println(linearSol(arr));
    }
}
