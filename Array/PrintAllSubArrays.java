package array;

public class PrintAllSubArrays {

    public static void printSubarrays(int arr[]) {
        int tp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j=i;j<arr.length;j++) {
                for (int k=i;k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total no. of Subarrays : " + tp);
    }

    public static void main(String args[]) {
        int num[]={1,2,3,4,4,5,2,8};
        printSubarrays(num);
    }
}
