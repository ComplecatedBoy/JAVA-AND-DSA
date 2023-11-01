package array;

public class MinAndMax {

    public static int getlargest(int arr[]){
         int value = Integer.MIN_VALUE;
         for( int i=0; i<arr.length ;i++){
         if(arr[i]>value)
         value=arr[i];
         }
         return value;
    }
    public static int getsmallest(int arr[]){
         int value = Integer.MAX_VALUE;

         for( int i=0; i<arr.length ;i++){
            if(arr[i]<value)
            value=arr[i];
          }
         return value;
    }

    public static void main (String args[]){
        int numbers[]={1,3,4,5,6,4,6,3,3,53,-4,6,3,3,2,0,5};
        System.out.println("The largest number is :"+getlargest(numbers)+"\n&& The smllest number is:"+ getsmallest(numbers));
    }
    
}
