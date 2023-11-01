package array;

public class LinearSearch{


    public static int lsearch(int arr[],int searchkey){
      int index= -1;
      for ( int i=0;i<arr.length;i++){
        if(searchkey==arr[i]){
            index=i;
        }
      }
    
        return index;
    }
    public static void main (String[]args){
        int arr[] ={2,4,6,8,10,12,14};
        int key=10;
        int rindex=lsearch(arr,key);
        System.out.println("the index of the"+key+"is :" + rindex );

    }
}
