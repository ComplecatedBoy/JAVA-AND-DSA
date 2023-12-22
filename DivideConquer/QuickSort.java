package DivideConquer;

public class QuickSort {
 
    public static void printarr(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static int partition(int[]num,int start,int end){
    
        int pivot=num[end];

        int j=start;

        int i=start-1;

        while(j<end){
            if(num[j]<=pivot){
                i++;
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
            j++;
        }
         i++;
        int temp2=num[end];
        num[end]=num[i];
        num[i]=temp2;

       return i;

    }

    public static void quicksort(int[]num,int start,int end){
        if(start>=end)return;
        int Pindex=partition(num,start,end);
        quicksort(num, start, Pindex-1);
        quicksort(num, Pindex+1, end);
    }

    public static void main(String[] args) {
        int[]num={2,4,3,9,8,5};
        quicksort(num,0,num.length-1);
        printarr(num);
    }
}
