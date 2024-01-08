package LinkedList;

public class DoublyLinkedList{
        
    static class DllNode{
        int val;
        DllNode next;
        DllNode prev;
    
        DllNode(int v){
            this.val=v;
            this.next=null;
            this.next=null;
        }
    }

    static DllNode head=null;
    static DllNode tail=null;
    static int size=0;

    public static void addFirst(int val){
        DllNode newNode=new DllNode(val);
        if(size==0){
            head=tail=newNode;
        }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        size++;
       
    }
    public static void addLast(int val){
        DllNode newNode=new DllNode(val);
        if(size==0){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }

    public static void removeFirst(){
       if(size==0){
        System.out.println("Doubly Linked List is empty");
        return ;
       }
       if(size==1){
        head=tail=null;
       }else{
           head=head.next;
           head.prev=null;
       }
       size--;
    }
    public static void removeLast(){
        if(size==0){
            System.out.println("Doubly Linked List is empty");
            return;
        }
         if(size==1){
        head=tail=null;
        }else{
           tail=tail.prev;
           tail.next=null;
        }
        size--;
    }

    public static void print(){
        DllNode temp=head;
        if(head==null){
            System.out.println("null");
            return;
        }
        System.out.print("null <- ");
        while(temp.next!=null){
            System.out.print(temp.val+" <--> ");
            temp=temp.next;
        }

        System.out.println(temp.val+" -> null");
    }

    public static void reverse(){

        if(size<=1)return;

        DllNode prev=null;
        DllNode curr=head;
        DllNode next;

        while(curr!=null){
            next=curr.next;
            
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next; 
        }

        tail=head;
        head=prev;
    }


    public static void main(String[] args) {
          addFirst(4);
          addLast(3);
          addFirst(1);
          addLast(6);
        //   print();
        //   removeFirst();
        //   print();
        //   removeLast();
        //   print();
        //   removeFirst();
        //   print();
        //   removeLast();
          print();
          reverse();
          print();
    }
}
