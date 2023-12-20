package BackTrackingProblems;

import java.util.ArrayList;

public class TugofWar{
    public static int  diff=Integer.MAX_VALUE;
       public static void solvetow(int index,ArrayList<Integer>ans1,
                                ArrayList<Integer>ans2,int[]arr,int n1,int n2,int sum1,int sum2,
                                ArrayList<Integer>cur1,ArrayList<Integer>cur2){
                if (cur1.size()==n1&&cur2.size()==n2&&Math.abs(sum1-sum2)<diff) {
                    System.out.println(diff);
                    diff=Math.abs(sum1-sum2);
                    ans1.clear();
                    ans1.addAll(cur1);
                    ans2.clear();
                    ans2.addAll(cur2);
                    return;
                }
                if (index==arr.length) {
                    return;
                }
                cur2.add( arr[index]);
              solvetow(index+1,ans1, ans2, arr, n1, n2, sum1, sum2+arr[index], cur1, cur2);
                cur2.remove(cur2.size()-1);
                 cur1.add(arr[index]);
              solvetow(index+1,ans1, ans2, arr, n1, n2, sum1+arr[index], sum2, cur1, cur2);
                cur1.remove(cur1.size()-1);
          }




    public static  void tugOfWar(int[]arr){
        int N=arr.length;
        int n1;int n2;
          if(N%2==0)n1=n2=N/2;
        else{
        n1=N/2;
        n2=(N+2)/2;
        }

        int sum1=0;
        int sum2=0;

        ArrayList<Integer>ans1=new ArrayList<>(n1);
        ArrayList<Integer>ans2=new ArrayList<>(n2);
        ArrayList<Integer>cur1=new ArrayList<>();
        ArrayList<Integer>cur2=new ArrayList<>();

        solvetow(0,ans1,ans2,arr,n1,n2,sum1,sum2,cur1,cur2);

        System.out.println(ans1);
        System.out.println(ans2);
    }
    public static void main(String[] args) {
        int []arr = {23, 45, -34, 12, 0, 98,
            -99, 4, 189, -1, 4};
       tugOfWar(arr);
    }
}
