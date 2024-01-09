package LinkedList;

public class Sort012 {
    public static void sort(LinkedList<Integer>ll){
        int[] frequency=new int[3];
        ListNode<Integer> start=ll.head;

        while (start!=null) {
             frequency[start.val]++;
             start=start.next;
        }
        for (int  i : frequency) {
            System.out.println(i);
        }
        start=ll.head;
        for (int i = 0;i<frequency.length; i++) {
            while(frequency[i]-->0){
                start.val=i;
                start=start.next;
            }
        }
      }

      public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.addFirst(2);
        ll.addLast(2);
        ll.addFirst(1);
        ll.addLast(1);
        ll.addLast(0);
        ll.addLast(2);
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(1);
        ll.addLast(1);
        ll.addLast(0);
        ll.addLast(2);
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.print();
        sort(ll);
        ll.print();
      }
}
