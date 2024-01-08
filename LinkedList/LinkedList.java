package LinkedList;

// LinkedList<V>(); 
// LinkedList<V>(val);
// LinkedList<V>(val,next);

//size();
//isEmpty();
//print();

//searchItr(val);
//searchRec(val);
//searchRecUtil(node,val);

//reverse();
//searchFromLast(n);

//addFirst(val);
//addLast(val);
//add(idx,val);

//remove(idx);
//removeFirst()
//removeLast();


public class LinkedList<V>{
    //fields
     ListNode<V>head;
     ListNode<V>tail;
     int size;

    // constructor
    LinkedList(){
        this.head=this.tail=null;
        this.size=0;
    }
    LinkedList(V v){
        this.tail=this.head=new ListNode<V>(v);
        this.size=1;
    }

    // Methods

    //size
    int size(){
        return size;
    }

    //isEmpty
    boolean isEmpty(){
        return size==0;
    }

    // addFirst
    boolean addFirst(V v){
        try {
            ListNode<V>newNode=new ListNode<V>(v);
            newNode.next=head;
            head=newNode;

            if(tail==null){
                tail=newNode;
            }
            size++;
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    // addLast
    boolean addLast(V v){
        try {
            ListNode<V>newNOde=new ListNode<V>(v);
            if(tail==null){
                head=tail=newNOde;
            }else{
                tail.next=newNOde;
                tail=newNOde;
            }
            size++;
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    // add at index
    boolean add(int idx,V v){

        if(idx==0)return addFirst(v);

        try {
            if(idx<0)throw new Exception("idx must not be less than 0");
            if(idx>size)throw new Exception("idx should not exceeds list size");

            ListNode<V>newNode=new ListNode<V>(v);
            ListNode<V>temp=head;

            while(idx-1>0){
                temp=temp.next;
                idx--;
            }
            newNode.next=temp.next;
            temp.next=newNode;

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    //removeFirst
    V removeFirst(){
        V val=null;
        if(isEmpty()){
            return val;
        }
        val=head.val;
        head=head.next;
        size--;
        if(size==0)tail=head;
        return val;
    }

    // remove at index
    V remove(int idx){
        if(idx==0)return removeFirst();
        V val=null;
        try {
            if(idx<0)throw new Exception("idx must not be less than 0");
            if(idx>=size)throw new Exception("idx must not exceeds size");

            ListNode<V>temp=head;
            int i=0;
            while(i<idx-1){
               temp=temp.next;
               i++;
            }
            val=temp.next.val;
            temp.next=temp.next.next;
            if(temp.next==null){
                tail=temp;
            }
            size--;
        } catch (Exception e) {
            System.out.println(e);
        }
        return val;
    }
    //removeLast
    V removeLast(){
        return remove(size-1);
    }

    
    int searchIter(V v){
        int i=0;
        ListNode<V>temp=head;
        while(temp!=null){
            if(temp.val==v)return i;
            temp=temp.next;
            i++;
        }
        return -1;
    }

    private int searchRecUtil(ListNode<V>node,V v){
        if(node==null)return -1;
        if(node.val==v){
              return 0;
        }
        int cur=searchRecUtil(node.next,v);
        return cur==-1?-1:cur+1;
    }
    int searchRec(V v){
        return searchRecUtil(head,v);
    }

    // reverseLinkedList
    boolean reverse(){
        try {
            
          ListNode<V>prev=null;
          ListNode<V>curr=head;
          ListNode<V>next=null;

          while(curr!=null){
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
          }
          tail=head;
          head=prev;

          return true;  
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //removeFromEnd
    V removeFromLast(int n){
        int idx=size-n;
        V val=null;
        try {
            if(idx<0)throw new Exception("N is greater than size of LinkedList");
            if(idx==0){
                val=head.val;
                head=head.next;
                if(head==null){
                    tail=null;
                }
            }else{
                ListNode<V>temp=head;
                int i=0;
                while(i<idx-1){
                    temp=temp.next;
                    i++;
                }
                val=temp.next.val;
                temp.next=temp.next.next;
                if(temp.next==null){
                    tail=temp;
                }
            }
            size--;
        } catch (Exception e) {
             System.out.println(e); 
        }
       return val;
    }

    // Print LinkedList
    void print(){
        ListNode<V>temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}