package LinkedList;

// Last node can not be deleted by this method

public class DeleteNodeWithoutHead {

    public static void delete(ListNode<Integer>node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
    
    public static void main(String[] args) {
        ListNode<Integer>head=new ListNode<Integer>(4);
        head.next=new ListNode<Integer>(2);
        head.next.next=new ListNode<Integer>(10);
        ListNode<Integer>node=head.next.next.next=new ListNode<Integer>(1);
        head.next.next.next.next=new ListNode<Integer>(10);
        head.next.next.next.next.next=new ListNode<Integer>(8);
        head.next.next.next.next.next.next=new ListNode<Integer>(4);

        PrintLinkedList.print(head);

        delete(node);

        PrintLinkedList.print(head);
    }
}
