package array;

import java.util.HashMap;

public class KdivisibleSum {
    public static int FindDiff(int[]arr,int k){
        int ans=0;

        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){

            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i : prefix) {
            System.out.print(i+" ");
        }
        System.out.println("...........................................................................................");

        for(int i=arr.length-1;i>=ans;i--){
             System.out.println(i+" "+prefix[i]);
             System.out.println();
             if(prefix[i]%k==0){
                ans=i+1;
                break;
             }

            for(int j=0;j<=i-ans;j++){
                int tempsum;
                tempsum=(prefix[i]-prefix[j]);

                System.out.println(j+" "+prefix[j]);
                System.out.println(tempsum);
                

                 if( tempsum % k == 0){
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println(i-j);
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    ans=i-j;
                    break;
                  }
            }
            System.out.println("...........................................................................................");

        }

        return ans;
        
    }

   static int longSubarrWthSumDivByK(int a[], int n, int k)
    {
    
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            a[i]=sum;
            int rem=sum%k;
            rem=(rem+k)%k;
            if(!map.containsKey(rem))map.put(rem,i);
        }

        // System.out.println(map);
        // for(int i:a)System.out.print(i+" ");
        
        for(int i=0;i<a.length;i++){
            int rem=a[i]%k;
            rem=(rem+k)%k;

            if(rem==0)ans=Math.max(ans,i+1);

            else if(map.containsKey(k-rem)){
                System.out.println(k-rem+" "+map.get(k-rem));
                ans=Math.max(ans,i-map.get(k-rem));
            }
            // System.out.println(ans);
        }
        // System.out.println();

        return ans;
    }


    public static void main (String []args){
        int[]nums={-2,2,-2,2,-2,2,-2,2,0};
        // int[]nums={1,2,-2,2,2};
        System.out.println(FindDiff(nums,3));
        System.out.println(longSubarrWthSumDivByK(nums, nums.length,3));
    }
    
}
