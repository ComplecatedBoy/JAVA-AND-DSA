package array;

public class ReverseArray {

    public static void reverse(int arr[]){
        int temp;

        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
           temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
    public static void main(String[]args){
        int num[]= {1,2,3,4,6,7};
        reverse(num);
     for (int i : num) {
         System.out.println(i);
    
     }
    }
}
