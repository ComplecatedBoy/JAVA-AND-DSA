package array;

public class ReapeatAndMissingNumber {
    public static int[] calc(int[]arr){
        int ans[]=new int[2];
        int temp;
       
       for(int i=0;i<arr.length;i++){

              while(arr[i]!=i+1){
                 if(arr[arr[i]-1]==arr[i]){
                  ans[0]=arr[i];
                  ans[1]=i+1;
                  break;
                  };
                temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
                 }
         
    }return ans;
}


    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,9,9,10};
        int ans[]=calc(nums);
        if(ans[0]!=0)
       System.out.print("["+ans[0]+","+ans[1]+"]");
       else
       System.out.println("There is no duplicate");
    }
    
}
