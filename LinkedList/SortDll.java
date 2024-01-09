package LinkedList;

public class SortDll {
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }

     }
     static Node add(Node head,int data){
        Node newNode= new Node(data);
           
         if (head==null) {
           return newNode;
         }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        temp=newNode;
        return head;
     }

    static void printDll(Node temp){
        System.out.print("null<->");
        while(temp!=null) {
         System.out.print(temp.data+"<->");
         temp=temp.next;
        }
        System.out.println("null");
    }


    public static Node sort(Node head){
        Node newNode=new Node(-1);
        Node temp=newNode;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        while(tail.next!=head){
            if (head.data<=tail.data) {
                head.prev=temp;
                temp.next=head;
                temp=temp.next;
                head=head.next;
                temp.next=null;
            }else{
                tail=tail.prev;
                tail.next.prev=temp;
                temp.next=tail.next;
                temp=temp.next;
                tail.next=null;
                temp.next=null;
            }
        }
        newNode=newNode.next;
        newNode.prev=null;
        return newNode;
   }
    public static void main(String[] args) {
        Node head=null;
        head= add(head,2);
        head= add(head,5);
        head= add(head,7);
        head= add(head,12);
        head= add(head,10);
        head= add(head,6);
        head= add(head,4);
        head= add(head,1);

        head=sort(head);
        printDll(head);
    }
}
