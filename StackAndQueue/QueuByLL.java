package StackAndQueue;

public class QueuByLL {

    static class  Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;

        Queue(){
            head=null;
            tail=null;
        }

        boolean isEmpty(){
            return head==null;
        }

        void add(int v){
            Node newNode=new Node(v);
            if(tail==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=tail.next;
        }

        int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int val=head.val;
            head=head.next;
            if(head==null)tail=null;
            return val;
        }

        int peek(){
            if( isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        } 
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        q.peek();
    }


}
