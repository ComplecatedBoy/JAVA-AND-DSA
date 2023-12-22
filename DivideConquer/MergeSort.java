package DivideConquer;

public class MergeSort {
    
    public static void printarr(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void merge(int[]num,int start,int mid,int end){
         int[] helper=new int[num.length];

         int i=start,j=mid;
         int index=start;

         while(i<mid&&j<=end){
               if(num[i]<num[j]){
                helper[index]=num[i];
                i++;
               }else{
                helper[index]=num[j];
                j++;
               }
               index++;
         }

         while(i<mid){
            helper[index++]=num[i++];
         }
         while (j<=end) {
            helper[index++]=num[j++];
         }

         while(start<=end){
              num[start]=helper[start];
              start++;
         }
    }


    public static void mergesort(int[]num,int start,int end){
        if(start>=end)return;
        int mid=start+(end-start)/2;

        mergesort(num, start,mid);
        mergesort(num,mid+1,end);
        
       
        merge(num,start,mid+1,end);
    }
    public static void main(String[] args) {
        int[] num={6,7,2,3,9,4,5,6};
        printarr(num);
        mergesort(num,0,num.length-1);
        printarr(num);

    }
}
