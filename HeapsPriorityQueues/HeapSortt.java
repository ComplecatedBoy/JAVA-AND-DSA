package HeapsPriorityQueues;

public class HeapSortt {
    // static void heapify(int[]arr,int i,int length){
    //    int  left=2*i+1;
    //    int  right=2*i+2;
    //    int  idx=i;
    //    if(left<length && arr[left]>arr[idx]){
    //     idx=left;
    //    }
    //    if(right<length && arr[right]>arr[idx]){
    //     idx=right;
    //    }

    //    if (idx!=i) {
    //     int temp=arr[i];
    //     arr[i]=arr[idx];
    //     arr[idx]=temp;
    //     heapify(arr, idx, length);
    //    }
    // }

    static void heapify(int[]arr,int i,int length){
        int left=2*i+1;
        int right=2*i+2;
        int idx=i;
        if(left<length&&arr[left]<arr[idx])idx=left;
        if(right<length&&arr[right]<arr[idx])idx=right;
        if(idx!=i){
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
            heapify(arr, idx, length);
        }
    }

    static void HeapSort(int[]arr){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }
    }
    
    public static void main(String[] args) {
        int[] arr={1,3,2,4,8,5};
        HeapSort(arr);
        for(int val:arr)
        System.out.print(val+" ");
    }
}
