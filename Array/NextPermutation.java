package array;

public class NextPermutation {

    public static  void nextPermutation(int[] nums) {
        int i=nums.length-2,j=nums.length-1;
            while(nums[i]>=nums[i+1]){
                i--;
                if(i<0){
                    break;
                }
            }
        if(i>=0){
            while(nums[j]<=nums[i]){
                System.out.println(i);
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1); 
    }

    public static void swap(int[]arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reverse(int []nums,int start,int end){
        int temp;
        while(start<end){
            temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []nums={1,5,6,4,3};

        nextPermutation(nums);

        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
    
}
