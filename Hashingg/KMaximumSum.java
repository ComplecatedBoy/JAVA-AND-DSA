package Hashingg;
import java.util.*;

class pair{
    int a;
    int b;
    public pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class sumPair implements Comparable<sumPair>{
    int sum;
    pair p;
    public sumPair(int sum,int a,int b){
        this.sum=sum;
        this.p=new pair(a,b);
    }
    public int compareTo(sumPair s){
     return Integer.compare(s.sum,this.sum);
    }
}

public class KMaximumSum {

    public static void MaxPairSum(Integer[]A,Integer[]B,int N,int K){
        Arrays.sort(A);
        Arrays.sort(B);
        int i=N-1;
        int j=N-1;
        PriorityQueue<sumPair>pq=new PriorityQueue<>();
        Set<pair>set=new HashSet<>();
        pq.add(new sumPair(A[i]+B[i], i, j));
      
        while(K>0){
    
            sumPair s=pq.remove();
            System.out.println(s.sum);
            i=s.p.a;
            j=s.p.b;
         
            if (i-1>0&&!set.contains(new pair(i-1, j))) {
                pq.add(new sumPair(A[i-1]+B[j],i-1,j));
                set.add(new pair(i-1, j));
            }
            if(j-1>0&&!set.contains(new pair(i, j-1))){
                pq.add(new sumPair(A[i]+B[j-1], i, j-1));
                set.add(new pair(i, j-1));
            }
            K--;
        }
    }
    public static void main(String[] args) {
        Integer A[] = { 1, 4, 2, 3 };
    Integer B[] = { 2, 5, 1, 6 };
    int N = A.length;
    int K = 4;
    MaxPairSum(A, B, N, K);
    }
}
