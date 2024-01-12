package Stack;
import java.util.*;

public class NextGreatElement {

    public static void findNextGreater(int[]arr,int[]next){
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=-1;
            }else{
                next[i]=s.peek();
            }
            s.add(arr[i]);
        }

        //Next Greater Left
        //Next Greater Right (this)
        //Next Smaller Left
        //Next Smaller Right
    }

    public static void main(String[] args) {
        int[]arr={6,8,0,1,3};
        int[]nextGreater=new int[arr.length];

        findNextGreater(arr,nextGreater);

        for(int i:nextGreater)
        System.out.print(i+" ");
        System.out.println();
    }
}
