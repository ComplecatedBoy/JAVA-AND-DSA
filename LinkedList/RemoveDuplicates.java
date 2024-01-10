package LinkedList;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void removedup(ListNode<Integer> head){
        ListNode<Integer> inode=head;
        ListNode<Integer> jnode;

        while (inode!=null) {
           ListNode<Integer>prev=inode;
           jnode=inode.next;

            while (jnode!=null) {
               if (jnode.val==inode.val) {
                   prev.next=jnode.next;
                   jnode=jnode.next;
               }else{
                   prev=prev.next;
                   jnode=jnode.next;
               }
             }
             inode=inode.next;
        }
   }

    public static void removedup2(ListNode<Integer>head){

        ListNode<Integer>prev;
        HashSet<Integer>set=new HashSet<>();
        set.add(head.val);

        while(head.next!=null){
            prev=head;
            head=head.next;
            if(set.contains(head.val)){
                prev.next=head.next;
                head=prev;
            }else{
               set.add(head.val);
            }   
        }

   }


   public static void main(String[] args) {
    ListNode<Integer>head=new ListNode<Integer>(4);
    head.next=new ListNode<Integer>(4);
    head.next.next=new ListNode<Integer>(4);
    head.next.next.next=new ListNode<Integer>(4);
    head.next.next.next.next=new ListNode<Integer>(10);
    head.next.next.next.next.next=new ListNode<Integer>(3);
    head.next.next.next.next.next.next=new ListNode<Integer>(4);

    PrintLinkedList.print(head);
    removedup2(head);
    PrintLinkedList.print(head);

   }
}
