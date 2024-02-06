package HeapsPriorityQueues;
import java.util.*;

 class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        public int compareTo(Student s){
            return this.rank-s.rank;
        }
        int Compare(Student a,Student b){
            return a.rank-b.rank;
        }
    }

class sortByrank implements Comparator<Student>{
        public int compare(Student a,Student b){
            return a.rank-b.rank;

    }
}


public class PriorityQueuee {
    public static void main(String[] args) {
        // PriorityQueue<Integer>pq=new PriorityQueue<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        // PriorityQueue<Student>p=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student>p=new PriorityQueue<>();

        p.add(new Student("rajat", 158));
        p.add(new Student("roshni", 55));
        p.add(new Student("muskan", 100));

        while (!p.isEmpty()) {
            System.out.println(p.peek().name+" "+p.peek().rank);
            p.remove();
        }

        System.out.println();
        pq.add(3);//O(log n)
        pq.add(5);
        pq.add(1);
        pq.add(7);
        Iterator<Integer>it=pq.iterator();
        int a=0;
        while(it.hasNext()){
            a=it.next();
        }
        System.out.println(a);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(log n);
        }
    }
    
}
