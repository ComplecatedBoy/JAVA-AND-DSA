package SearchingSorting;

public class MedianStream {


    public static int binarysearchpos(int[]arr,int n,int num, int start,int end){
        if (start >= end) {
            return (num > arr[start]) ? (start + 1) : start;
        }
 
        int mid = (start + end) / 2;
 
        if (num == arr[mid])
            return mid + 1;
 
        if (num > arr[mid])
            return binarysearchpos(arr,n, num, mid + 1, end);
 
        return binarysearchpos(arr,n, num, start, mid - 1);

    }




    public static void printMedian(int[]arr,int n){
    int i;int j;
    int count=1;
    int pos;
    int num;

     System.out.println("The median of the 1 integers is "+arr[0]);
     for ( i = 1; i < n; i++) {
        float median;
        num=arr[i];
        pos=binarysearchpos(arr,n,num,0,i-1);
        System.out.println(pos);
        j=i-1;
        while(j>=pos){
            arr[j+1]=arr[j];
            j--;
        }
        arr[pos]=num;
        for (int it : arr) {
            System.out.print(it+" ");
        }
        System.out.println();
        count++;
        if (count%2==1) {
            median=arr[count/2];
        } else {
            median=(arr[count/2]+arr[(count-2)/2])/2;
        }
          System.out.println("The median of the "+ count+"integers is "+median);
     }
    }
    public static void main(String[] args) {
            int arr[]
                = { 5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4 };
            int n = arr.length;
            printMedian(arr, n);
    }
    }
