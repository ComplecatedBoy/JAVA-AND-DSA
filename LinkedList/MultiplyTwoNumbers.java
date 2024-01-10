package LinkedList;

public class MultiplyTwoNumbers {

    static long mod=1000000007;

    public static long multiply(LinkedList<Integer>list1,LinkedList<Integer>list2){

        ListNode<Integer>temp1=list1.head;
        ListNode<Integer>temp2=list2.head;

        long num1=0;
        long num2=0;
   
        while(temp1!=null) {
           num1=((num1*10)%mod+temp1.val)%mod;
           temp1=temp1.next;
        }
         while(temp2!=null) {
           num2=((num2*10)%mod+temp2.val)%mod;
           temp2=temp2.next;
        }
        System.out.println(num1);
        System.out.println(num2);
         
        return (num1*num2)%mod;
   }


    public static void main(String[] args) {
        LinkedList<Integer>list1=new LinkedList<Integer>();
        LinkedList<Integer>list2=new LinkedList<Integer>();
        list1.addFirst(2);
        list1.addLast(4);
        list1.addFirst(2);
        list1.addFirst(2);
        // list1.addLast(4);
        // list1.addFirst(2);
        // list1.addFirst(6);
        list2.addFirst(7);
        // list2.addFirst(8);
        // list2.addFirst(1);
        // list2.addFirst(7);
        // list2.addFirst(8);
        // list2.addFirst(1);
        System.out.println(multiply(list1,list2));
    }
}
