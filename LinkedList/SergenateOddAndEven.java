package LinkedList;

public class SergenateOddAndEven {

    public static ListNode<Integer> sergenate(ListNode<Integer>head){

        ListNode<Integer>even=new ListNode<Integer>(-1);
        ListNode<Integer>odd=new ListNode<Integer>(-1);

        ListNode<Integer>temp1=even;
        ListNode<Integer>temp2=odd;
        
        
        while(head!=null){
            if(head.val%2==0){
                temp1.next=head;
                temp1=temp1.next;
            }else{
                temp2.next=head;
                temp2=temp2.next;
            }
            head=head.next;
            temp1.next=null;
            temp2.next=null;
        }
        temp1.next=odd.next;
        return even.next;
    }
    public static void main(String[] args) {
        ListNode<Integer>head=new ListNode<Integer>(1);
        head.next=new ListNode<Integer>(2);
        head.next.next=new ListNode<Integer>(3);

        ListNode<Integer>head2=new ListNode<Integer>(11);
        head.next.next.next=head2;
        head2.next=new ListNode<Integer>(11);
        head2.next.next=new ListNode<Integer>(22);

        ListNode<Integer>head3=new ListNode<Integer>(21);
        head2.next.next.next=head3;
        head3.next=new ListNode<Integer>(22);
        head3.next.next=new ListNode<Integer>(23);
        head3.next.next.next=new ListNode<Integer>(24);

        PrintLinkedList.print(head);
        head=sergenate(head);
        PrintLinkedList.print(head);
    }
}
