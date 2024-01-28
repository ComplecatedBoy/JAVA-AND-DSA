package BinaryTree;
import java.util.*;

public class MinimumSwapToBST {

    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void minSwap(int[]arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]helper=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
            helper[i]=arr[i];
        }
        int count=0;
        Arrays.sort(helper);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=helper[i]){
                int idx=map.get(helper[i]);
                map.put(arr[i],idx);
                swap(arr,i,idx);
                count++;
            }
        }
      System.out.println(count);
    }

    public static void getInorder(int a[],int idx,ArrayList<Integer>inorder){
        if(idx>=a.length)return;
        getInorder(a, 2*idx+1, inorder);
        inorder.add(a[idx]);
        getInorder(a, 2*idx+2, inorder);
    }
    public static void main(String[] args) {
        int a[]={5,6,7,8,9,10,11};
        ArrayList<Integer>inorder=new ArrayList<>();
        getInorder(a,0,inorder);
        System.out.println(inorder);
        // [8,6,9,5,10,7,11]
        int helper[]=new int[inorder.size()];
        int idx=0;
        for(int num:inorder){
            helper[idx++]=num;
        }
        minSwap(helper);
    }
}
