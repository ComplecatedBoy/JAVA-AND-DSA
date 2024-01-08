package LinkedList;

public class ListNode<V>{

    V val;
    ListNode<V>next;
    
    ListNode(){
        val=null;
        next=null;
    }

    ListNode(V val){
        this.val=val;
        next=null;
    }

    ListNode(V val,ListNode<V>next){
           this.val=val;
           this.next=next;
    }
    
}
