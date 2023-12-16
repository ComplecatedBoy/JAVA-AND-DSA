package BackTrackingProblems;
import java.util.ArrayList;


public class CombinationalSum{
   
  public static void combinationalSum(ArrayList<Integer> arr,ArrayList<Integer> al,Integer cursum,Integer sum,ArrayList ans,int index){
      if(cursum==sum){
        ArrayList<Integer>newal=new ArrayList<>(al.size());
        for (Integer intgr:al) {
            newal.add(intgr);
        }
          ans.add(newal);
          return;
      }
      if (cursum>sum) {
        return;
      }
      
    for (int i = index; i < arr.size(); i++) {
           cursum+= (int)arr.get(i);
           al.add(arr.get(i));
           combinationalSum(arr, al, cursum, sum, ans,i);
           cursum-=(int)arr.get(i);
           al.remove(arr.get(i));
        }
  }

    public static void main(String[] args) {
         ArrayList<Integer>arr=new ArrayList<>();
         arr.add(2);
         arr.add(4);
         arr.add(6);
         arr.add(8);

         Integer sum=8;
         Integer cursum=0;
         ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    

         combinationalSum(arr,new ArrayList<Integer>(),cursum,sum,ans,0);
         printal(ans);
    }

     public static void printal(ArrayList<ArrayList<Integer>>al){
    for (ArrayList a : al) {
        System.out.println(a);
    }
    }
}
