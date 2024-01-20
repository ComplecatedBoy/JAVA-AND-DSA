package StackAndQueue;
import java.util.*;

public class MaximumAreaHistogram {

    public static int maxArea(int[]arr){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        nsr(right,arr);
        nsl(left,arr);
        for(int i:left){
            System.out.println(i);
        }
        System.out.println("right");

        for(int i:left){
            System.out.println(i);
        }

        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,(right[i]-left[i]-1)*arr[i]);
        }
        return ans;
    }

    public static void nsl(int[]left,int[]arr){
        Stack<Integer>s=new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=s.peek();
            }
            s.push(i);
        }

    }
    public static void nsr(int[]right,int[]arr){
        Stack<Integer>s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                right[i]=arr.length;
            }else{
                right[i]=s.peek();
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
}
