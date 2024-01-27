package Greedy;
import java.util.*;

public class MaxHeightPyramid {
    public static void main(String[] args) {
        int[]arr={10, 20, 30, 50, 60, 70};

        int ans=0;
        Arrays.sort(arr);

        int prev_width=0;
        int cur_width=0;

        int cur_count=0;
        int prev_count=0;

        for(int i=0;i<arr.length;i++){
            cur_count++;
            cur_width+=arr[i];
            if(cur_count>prev_count&&cur_width>prev_width){
                ans++;
                prev_count=cur_count;
                prev_width=cur_width;
                cur_count=0;
                cur_width=0;
            }
        }
        System.out.println(ans);
    }
}
