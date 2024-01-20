package StackAndQueue;

public class StackdByLinkedList{
    private class Node{
        int val;
        Node next;
        Node(int val){
         this.val=val;
         next=null;
        }
    }

    private  Node head=null;
    private  int size=0;

   public  void push(int v){
        Node newNode=new Node(v);
        newNode.next=this.head;
        this.head=newNode;
        size++;
    }

     int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int val=this.head.val;
        this.head=this.head.next;
        size--;
        return val;
    }

     int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.val;
    }
    public  int size(){
        return size;
    }

    public  boolean isEmpty(){
        return size==0;
    }

    public static void main(String[] args) {
        StackdByLinkedList s=new StackdByLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(0);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}

