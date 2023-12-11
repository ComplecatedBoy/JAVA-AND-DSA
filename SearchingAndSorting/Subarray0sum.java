package SearchingSorting;

import java.util.ArrayList;
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}






public class Subarray0sum {

    public static void print(ArrayList<Pair>al){
    for (Pair p : al) {
        System.out.println("The subarray start at "+p.first+" and ends at "+p.second);
    }
}

public static ArrayList<Pair> findSubArr(int[]arr,int length){
    ArrayList<Pair>al= new ArrayList<>();
    int sum=0;

    for(int i=0;i<length;i++){
       
        sum+=arr[i];
        if (sum==0) {
            al.add(new Pair(i,i));
        }
        for (int j=i+1; j < length; j++) {
            sum+=arr[j];
            if (sum==0) {
            al.add(new Pair(i,j));
            }
        }
         sum=0;
    }
    return al;
}
public static void main(String args[])
  {
    int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
    int n = arr.length;

    

    ArrayList<Pair>out=new ArrayList<>();
    out=findSubArr(arr,n);

    if (out.size() == 0)
      System.out.println("No subarray exists");
    else
      print(out);
  }
}
