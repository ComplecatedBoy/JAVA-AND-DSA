package array;
public class SearchInRotatedSortedArray {
    public static int helper(int[]nums,int start,int end,int target){
        
        if(start>end)return -1;

        int mid=start+(end-start)/2;
        if(nums[mid]==target)return mid;

        if(nums[start]<=nums[mid]){
            if(target>=nums[start]&&target<nums[mid])return helper(nums,start,mid-1,target);
            else return helper(nums,mid+1,end,target);
        }else{
            if(target>nums[mid]&& target<=nums[end])return helper(nums,mid+1,end,target);
            else return helper(nums,0,mid-1,target);
        }
    }
    

    public static int search(int[] nums, int target){
        return helper(nums,0,nums.length-1,target);
    }
    
    
    public static void main(String[] args) {
        int nums[]={6,7,8,9,10,11,12,13,0,1,2,3,4,5};
        System.out.println(search(nums,0));
    }

}