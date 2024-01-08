package LinkedList;

public class RemoveCycle {

    public static void remove(ListNode<Integer>head) {
        ListNode<Integer>slow=head;
        ListNode<Integer>fast=head;
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)break;
        }

        slow=head;
        ListNode<Integer>prev=fast;
        while(fast.next!=slow){
            prev=fast;
            fast=fast.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        prev.next=null;
    }
    public static void main(String[] args) {
        ListNode<Integer>head=new ListNode<Integer>(4);
        head.next=new ListNode<Integer>();
        head.next.next=new ListNode<Integer>(10);

        ListNode<Integer>joint=new ListNode<Integer>();
        head.next.next.next=joint;
        head.next.next.next.next=new ListNode<Integer>(10);
        head.next.next.next.next.next=new ListNode<Integer>();
        head.next.next.next.next.next.next=new ListNode<Integer>(4);
        head.next.next.next.next.next.next.next=joint;

        System.out.println(CheckCycle.isCycle(head));
        remove(head);
        System.out.println(CheckCycle.isCycle(head));
    }
}
