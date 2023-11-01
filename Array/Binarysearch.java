package array;

public class Binarysearch {

    public static int Bsearch(int arr [],int key ){ 

      int start =0, end=arr.length;
      while(start<end){
          int mid= (start+end)/2;
          if(key== arr[mid] )return mid;
          else if(key < arr[mid]) end=mid-1;
          else start=mid+1;
      }
      return -1;
    }
    public static void main (String args[]){
    int num[]= {1,2,3,4,5,7,8678,99800,87767666};
    int key=4;
    System.out.println("The index of the number "+key+" is:"+Bsearch(num,key));
    }
    
}
