package array;

public class MinOpsToMakePalindrome {

    public static void FindMinOps(int []arr){
         int start=0; int end = arr.length-1;
         int op=0;

        while(start<end){
            if(arr[start]==arr[end]){
               start++;
               end--;
            }
            else if(arr[start]<arr[end]){
             arr[start+1]=arr[start]+arr[start+1];
             start++;
             op++;
            }
            else {
                arr[end-1]=arr[end]+arr[end-1];
                end--;
                op++;
            }
        }
            System.out.println(op);
    }
    

    public static void main(String[] args) {
        int [] arr={11, 14, 15, 99};
        FindMinOps(arr);
    }
}
