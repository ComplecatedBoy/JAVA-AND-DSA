///Thisis the brute force algorithms
package array;
public class MaxSumArr1{
    public static int  MaxSumSA(int arr[]) {
        int maxsum = 0;
        int csum=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j=i;j<arr.length;j++) {

                for (int k=i;k<=j; k++) {

                    csum += arr[k];  

                }

                if(csum > maxsum){
                    maxsum=csum;
                }
                csum=0;
            }
        }
       return maxsum;
    }

    public static void main(String args[]) {
        int num[]={1,-2,6,-1,3};
       System.out.println(MaxSumSA(num));
    }
}