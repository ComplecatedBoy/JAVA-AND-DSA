package SearchingSorting;

public class CheckRevesing {
    public static boolean checkkar(int[]arr){

        int i=0;
        int j=arr.length-1;

        for (i=0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                break;
            }
        }

        for (j=arr.length-1; j>0; j--) {
            if(arr[j]<arr[j-1]){
                break;
            }
        }

        if(i==arr.length-1||j==0) {
            return true;
        }

        if((i!=0&&arr[i-1]>arr[j])||(j!=arr.length-1&&arr[j+1]<arr[i]))return false;

        while(i<j){
            if(arr[i]<arr[i+1])return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={1,2,5,4,3};
        System.out.println(checkkar(arr));
        
    }
}
