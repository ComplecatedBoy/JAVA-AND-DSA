package HeapsPriorityQueues;
import java.util.*;

class Car implements Comparable<Car>{
    String name;
    int x;
    int y;

    Car(String name,int x,int y){
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Car c){
        return (this.x*this.x+this.y*this.y)-(c.x*c.x+c.y*c.y);
    }
}

public class KnearestCar {
    public static void main(String[] args) {
        PriorityQueue<Car>pq=new PriorityQueue<>();
        pq.add(new Car("C0", 4, 3));
        pq.add(new Car("C1", 5, -1));
        pq.add(new Car("C2",-2,4));
        pq.add(new Car("CM",0,0));
        for (int i = 0; i < 1; i++) {
            System.out.println(pq.remove().name);
        }
    
    }
}
