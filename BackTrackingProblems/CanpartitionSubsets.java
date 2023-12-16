package BackTrackingProblems;
import java.util.*;
public class CanpartitionSubsets {
      public static boolean possible(int[]arr,int index,boolean[]visited,int target,int cursum){
           if(index>=arr.length){
            return false;
           }else if(visited[index]==true){
           return possible(arr, index+1, visited, target, cursum);
           }
           else if(cursum==target){
            return true;
           }
           visited[index]=true;
           if(possible(arr, index+1, visited, target, cursum+arr[index]))return true;
           visited[index]=false;
           if(possible(arr, index+1, visited, target, cursum))return true;
         return false;
      }


    public static boolean Ispossible(int[]arr,boolean[]visited,int target,int k){
       
        int count=0;
        for(int i=0;i<k;i++){
        
            if (possible(arr,0,visited,target,0)) {
                count++;
            }
            
        }
        if (count==k-1) {
            return true;
        }
        return false;
    }


    public static void CanBeparted(int[]arr,int K){
        int sum=0;
        for (int i : arr) {
             sum+=i;
        }
        if(sum%K!=0){
            System.out.println("No");
        }else{
          int target=sum/K;
          boolean[]visited=new boolean[arr.length];
          Arrays.fill(visited,false);
          if(Ispossible(arr,visited,target,K)){
            System.out.println("Yes");
          }else{
            System.out.println("NO");
          }


        }
    }
    public static void main(String[] args) {
        int[]arr={2,1,5,5,6};
        int k=3;
        CanBeparted(arr,k);
    }
}
