package LinkedList;

public class Main {
    public static void main(String[]args){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.addFirst(4);
        ll.addLast(3);
        ll.addFirst(5);
        ll.addLast(9);
        ll.addFirst(1);
        ll.addLast(11);
        ll.addFirst(8);
        ll.addLast(13);
        ll.addFirst(10);
        ll.print();
        System.out.println(ll.reverse());
        ll.print();
        System.out.println(ll.removeFromLast(6));
        ll.print();
    }
}
