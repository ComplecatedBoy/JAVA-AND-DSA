package LinkedList;

public class QuickSort {

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    static void addNode(Node head,int data)
    {
        if (head == null) {
            head = new Node(data);
            return;
        }
        while (head.next != null)
            head = head.next;

        Node newNode = new Node(data);
        head.next = newNode;

    }
  
    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data);
            System.out.print("->");
            head = head.next;
        }
        System.out.println("null");

    }

    static Node partition(Node start,Node end){
        if (start == end || start == null || end == null)
        return start;

        Node last=end;
        
        while(start.data>last.data){
            Node next=end.next;
            end.next=start;
            end=start;
            start=start.next;
            end.next=next;
        }
        

        Node curr=start.next;
        Node prev=start;
        while(curr!=last){
            if (curr.data>last.data){
                Node next=end.next;
                 prev.next=curr.next;
                 end.next=curr;
                 end=end.next;
                 end.next=next;
                 curr=prev.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return start;
    }

    static Node sort(Node start,Node end){
    if(start==end)return start;

     start=partition(start,end);

    Node pivot_prev=start;

     while(pivot_prev.next!=end){
        pivot_prev=pivot_prev.next;
     }
     while(end.next!=null){
        end=end.next;
     }
     if (start!=pivot_prev) {
       start=sort(start, pivot_prev);
     }
     if (pivot_prev.next.next!=null) {
         sort(pivot_prev.next,end);
     }
    return start;
    }


    static Node quicksort(Node head){
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        return sort(head,tail);
    }

    public static void main(String[] args) {

        Node head=new Node(0);
        addNode(head,30);
        addNode(head,303);
        addNode(head,04);
        addNode(head,20);
        addNode(head,5);
        addNode(head,60);
        addNode(head,400);
        addNode(head,30);
        addNode(head,4);
        addNode(head,20);
        addNode(head,30);
        addNode(head,3);
        addNode(head,-10005);

        printList(head);
        head=quicksort(head);
        printList(head);
    }
}
