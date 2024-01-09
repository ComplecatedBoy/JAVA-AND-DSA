package LinkedList;

public class MergeSort {

    public static ListNode<Integer>getMid(ListNode<Integer>head){

        ListNode<Integer>slow=head;
        ListNode<Integer>fast=head.next;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode<Integer> merge(ListNode<Integer>left,ListNode<Integer>right){

        ListNode<Integer>mergedList=new ListNode<Integer>(-1);

        ListNode<Integer>temp=mergedList;

        while(left!=null&&right!=null){

            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        while (left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while (right!=null) {
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }

        return mergedList.next;

    }

    public static ListNode<Integer> sort(ListNode<Integer>head){

        if(head==null||head.next==null)return head;
        ListNode<Integer>mid=getMid(head);

        ListNode<Integer>leftHead=head;
        ListNode<Integer>rightHead=mid.next;
        mid.next=null;

        leftHead=sort(leftHead);
        rightHead=sort(rightHead);
        
        return merge(leftHead, rightHead);
    }

    public static void main(String[] args) {
        ListNode<Integer>head=new ListNode<Integer>(4);
        head.next=new ListNode<Integer>(2);
        head.next.next=new ListNode<Integer>(10);
        head.next.next.next=new ListNode<Integer>(1);
        head.next.next.next.next=new ListNode<Integer>(10);
        head.next.next.next.next.next=new ListNode<Integer>(8);
        head.next.next.next.next.next.next=new ListNode<Integer>(4);
 
        PrintLinkedList.print(head);
        head=sort(head);
        PrintLinkedList.print(head);

    }
}
