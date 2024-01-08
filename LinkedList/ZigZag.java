package LinkedList;

public class ZigZag {

    public static ListNode<Integer>getMid(ListNode<Integer>head){

        ListNode<Integer>slow=head;
        ListNode<Integer>fast=head.next;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

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

    public static ListNode<Integer>zigzag(ListNode<Integer>head){

           ListNode<Integer>mid=getMid(head);

           ListNode<Integer>right=mid.next;
           mid.next=null;

           ListNode<Integer>left=head;
           right=reverse(right);

           return merge(left,right);
    }

    public static ListNode<Integer>merge(ListNode<Integer>left,ListNode<Integer>right){
        ListNode<Integer>mergedList=new ListNode<Integer>(0);
        ListNode<Integer>temp=mergedList;
        while(left!=null){
            temp.next=left;
            left=left.next;

            if(right==null)break;
            temp.next.next=right;
            right=right.next;
            temp=temp.next.next;
        }
        return mergedList.next;
    }

    public static void main(String[] args) {
        ListNode<Integer>head=new ListNode<Integer>(1);
        head.next=new ListNode<Integer>(2);
        head.next.next=new ListNode<Integer>(3);
        head.next.next.next=new ListNode<Integer>(4);
        head.next.next.next.next=new ListNode<Integer>(5);
        head.next.next.next.next.next=new ListNode<Integer>(6);
        head.next.next.next.next.next.next=new ListNode<Integer>(7);
        PrintLinkedList.print(head);
        head=zigzag(head);
        PrintLinkedList.print(head);
    }
}
