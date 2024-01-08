package LinkedList;

class PrintLinkedList{
    public static void print(ListNode head){
        while (head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println("null");
    }
}
