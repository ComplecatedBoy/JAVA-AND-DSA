package HeapsPriorityQueues;
import java.util.*;

public class WeakestRow{

    static class Row implements Comparable<Row>{
         int stregnth;
         int idx;
         Row(int stregnth,int idx){
            this.stregnth=stregnth;
            this.idx=idx;
         }
         public int compareTo(Row r){
            if(this.stregnth!=r.stregnth)return this.stregnth-r.stregnth;
            return this.idx-r.idx;
         }
    }
    public static void main(String[] args) {
          int[][]army={
            {1,0,0,0,0},
            {1,1,1,1,1},
            {1,0,0,0,0},
            {1,0,0,0,0}
          };
          int n=army.length;
          int k=2;

          PriorityQueue<Row>pq=new PriorityQueue<>();
          for (int i=0;i<n;i++) {
            int stregnth=0;
            for (int  val : army[i]) {
                stregnth+=val;
            }
            pq.add(new Row(stregnth, i));
          }
          
          for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
          }

    }
}
