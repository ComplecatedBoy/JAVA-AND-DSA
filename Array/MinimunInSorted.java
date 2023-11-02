package array;

public class MinimunInSorted {

    public static int search( int arr[]){
         int start=0; int end=arr.length-1;
    
        while(end>=start){
            if(arr[start]<=arr[end]){
                return start;
            }
            if(end-start==1){
                if(arr[end]<arr[start])
                    return end;
            }

            int mid=(end+start)/2;

            if(arr[mid]<arr[mid-1])
            return mid;

            if(arr[mid]<arr[start])
            end=mid-1;

            else if(arr[mid]>arr[start])
            start=mid+1;

        }
        return  start ;
    }

    public static void main(String[] args) {
        int arr[]={6,7,8,9,1,2,3,4,5};
        {
            int index=search(arr);
            System.out.print(arr[index]);
        }
    }
    
}
