package Greedy;

public class MinTimeJobConstraints {

    public static boolean isPossible(int []jobs,int k,int val){
        int count=0;
        int sum=0;
        for(int job:jobs){
            if(sum+job>val){
                sum=job;
                count++;
            }else{
                sum+=job;
            }
        }

        return count<=k;
    }

    public static int findMinTime(int k,int T,int[]jobs,int n){
       int start=0; int end=0;
       int max_job=jobs[0];
       int ans=Integer.MAX_VALUE;

       for(int job:jobs){
           max_job=Math.max(job,max_job);
           end+=job;
       }

       while(start<end){
        int mid=start+(end-start)/2;

        if( mid>=max_job && isPossible(jobs,k,mid) ){
            ans=Math.min(ans,mid);
            end=mid-1;
        }else{
            start=mid+1;
        }
       }
       return ans;
    }

    public static void main(String[] args) {
        int job[] = {10, 7, 8, 12, 6, 8};
        int n = job.length;
        int k = 4, T = 5;
        System.out.println(findMinTime(k, T, job, n));
    }
}
