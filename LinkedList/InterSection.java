package LinkedList;

public class InterSection {

     public static ListNode<Integer> getMthindex(ListNode<Integer> head,int idx){
        int index=0;
        ListNode<Integer> temp=head;
        while(index!=idx){
            index++;
            temp=temp.next;
        }
        return temp;
    }

    public static int getintersect(ListNode<Integer> head1,ListNode<Integer> head2,int n,int m){
        ListNode<Integer> start=getMthindex(head1,n-m);
        while(head2!=null){
            if(head2==start){
                return head2.val;
            }
            head2=head2.next;
            start=start.next;
        }
        return -1;
    }

        //Function to find intersection point in Y shaped Linked Lists.
    public static int intersectPoint(ListNode<Integer> head1, ListNode<Integer> head2){   
        ListNode<Integer> temp1=head1;
        ListNode<Integer> temp2=head2;
        int n=0;
        int m=0;
        
        while(temp1!=null){
            n++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            m++;
            temp2=temp2.next;
        }

        if(n>m)return getintersect( head1, head2,n,m);
        else return getintersect( head2, head1,m,n);
    }

    public static void main(String[] args) {

        ListNode<Integer>head1=new ListNode<Integer>(1);
        ListNode<Integer>head2=new ListNode<Integer>(11);

        ListNode<Integer>head3=new ListNode<Integer>(21);
        head3.next=new ListNode<Integer>(22);
        head3.next.next=new ListNode<Integer>(23);
        head3.next.next.next=new ListNode<Integer>(24);

        head1.next=new ListNode<Integer>(2);
        head1.next.next=new ListNode<Integer>(3);
        head1.next.next.next=head3;

        head2.next=head3;

        System.out.println(intersectPoint(head1,head2));   
    }
}
