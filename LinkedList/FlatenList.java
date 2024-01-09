package LinkedList;

public class FlatenList {

    static Node head;

    static class Node{
        int data;
        Node next,child;
        Node(int data){
            this.data=data;
            this.next=null;
            this.child=null;
        }
    }


    static Node createList(int[]arr,int length){
        Node node= new Node(arr[0]);
        Node temp=node;
        for(int i=1;i<length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return node;
    }



    static Node createList(){
        int arr1[] = {10, 5, 12, 7, 11};
        int arr2[] = {4, 20, 13};
        int arr3[] = {17, 6};
        int arr4[] = {9, 8};
        int arr5[] = {19, 15};
        int arr6[] = {2};
        int arr7[] = {16};
        int arr8[] = {3};

        Node head1 = createList(arr1, arr1.length);
        Node head2 = createList(arr2, arr2.length);
        Node head3 = createList(arr3, arr3.length);
        Node head4 = createList(arr4, arr4.length);
        Node head5 = createList(arr5, arr5.length);
        Node head6 = createList(arr6, arr6.length);
        Node head7 = createList(arr7, arr7.length);
        Node head8 = createList(arr8, arr8.length);

        printList(head1);

        head1.child=head2;
        head1.next.next.next.child=head3;
        head2.next.child=head6;
        head2.next.next.child=head7;
        head7.child=head8;
        head3.child=head4;
        head4.child=head5;
        return head1;
    }

    static void flatten(Node head){
        if (head==null) {
            return;
        }
        Node tail=head;

        while(tail.next!=null){
            tail=tail.next;
        }
        Node curr=head;

        while (curr!=tail) {
            if (curr.child!=null) {
                tail.next=curr.child;
                while(tail.next!=null){
                    tail=tail.next;
                }
            }
            curr=curr.next;
        }
    }

    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args){
        Node head=createList();
        flatten(head);
        printList(head);
        
    }
}
