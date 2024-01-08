package LinkedList;

public class CheckPalindrome {

    public static ListNode<Integer>reverse(ListNode<Integer>head){
        ListNode<Integer>prev=null;
        ListNode<Integer>curr=head;
        ListNode<Integer>next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    public static ListNode<Integer>getMid(ListNode<Integer>head){

        ListNode<Integer>slow=head;
        ListNode<Integer>fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static boolean isPalinderome(ListNode<Integer>head){
        //find mid
        ListNode<Integer>mid=getMid(head);

        ListNode <Integer>leftHead=head;
        ListNode<Integer>rightHead=reverse(mid.next);

        while(rightHead!=null&&leftHead!=null){
             if(leftHead.val!=rightHead.val)
             return false;

             rightHead= rightHead.next;
             leftHead= leftHead.next;
        }
        return true;
    }
    public static void main(String[] args) {

        ListNode<Integer>head=new ListNode<Integer>(4);
        head.next=new ListNode<Integer>();
        head.next.next=new ListNode<Integer>(10);
        head.next.next.next=new ListNode<Integer>();
        head.next.next.next.next=new ListNode<Integer>(10);
        head.next.next.next.next.next=new ListNode<Integer>();
        head.next.next.next.next.next.next=new ListNode<Integer>(4);

        System.out.println(isPalinderome(head));

    }
}
