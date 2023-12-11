package SearchingSorting;

public class Mediansorted {

    public static void merge(int[]arr1,int[]arr2,int[]mergedarr){
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]) {

                mergedarr[i+j]=arr1[i];
                i++;
            }else{
                mergedarr[i+j]=arr2[j];
                j++;
            }
        }
        while (i<arr1.length) {
            mergedarr[i+j]=arr1[i];
            i++;
        }
          while (j<arr2.length) {
            mergedarr[i+j]=arr2[j];
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = { -5, 3, 6, 12, 15 };
        int[] arr2 = { -12, -10, -6, -3, 4, 10 };
        int[] mergedarr=new int[arr1.length+arr2.length];
        merge(arr1,arr2,mergedarr);
        
           if(mergedarr.length%2==1){
                 System.out.println(mergedarr[mergedarr.length/2]);

           }else{
            System.out.println((mergedarr[mergedarr.length/2]+mergedarr[(mergedarr.length-2)/2])/2);
           }
    }
}
