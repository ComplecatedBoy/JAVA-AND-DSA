package StackAndQueue;

public class StackWithMiddleOperation {
    //Using DLL 
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=this.prev=null;
        }
    }

    public static class Stack {
        Node head;
        Node mid;

        int size;

        Stack(){
            head=mid=null;
            size=0;
        }

        void push(int v){
            Node newNode =new Node(v);
            if(size==0){
                head=mid=newNode;
                size=1;
                return;
            }
            head.next=newNode;
            newNode.prev=head;
            head=newNode;
            size++;
            if(size%2!=0){
                mid=mid.next;
            }
        }

        int  pop(){
            int val=-1;
            if(size==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            val=head.val;
            if(size==1){
                head=mid=null;
                size=0;
                return val;
            }

            head=head.prev;
            head.next=null;
            size--;
            if(size%2==0){
                mid=mid.prev;
            }
            return val;
        }

        int findMiddle(){
            if(size==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return mid.val;
        }

        int deleteMiddle(){
            if(size==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int val=mid.val;
            if(size==1){
                mid=head=null;
                size=0;
                return val;
            }

            if(size==2){
                mid=mid.next;
                mid.prev=null;
                size--;
                return val;
            }

            mid.prev.next=mid.next;
            mid.next.prev=mid.prev;
            size--;
            if(size%2!=0){
                mid=mid.next;
            }else{
                mid=mid.prev;
            }
            return val;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(3);
        System.out.println("MIddel "+ s.findMiddle());
        s.push(4);
        System.out.println("MIddel "+ s.findMiddle());
        s.push(5);
        System.out.println("MIddel "+ s.findMiddle());
        s.push(6);
        System.out.println("MIddel "+ s.findMiddle());
        s.push(7);
        System.out.println("MIddel "+ s.findMiddle());
        s.push(8);
        System.out.println("MIddel "+ s.findMiddle());
        s.push(9);
        System.out.println("MIddel"+ s.findMiddle());


        s.deleteMiddle();
        System.out.println("MIddel "+ s.findMiddle());
        s.deleteMiddle();
        System.out.println("MIddel "+ s.findMiddle());
        s.deleteMiddle();
        System.out.println("MIddel "+ s.findMiddle());

        s.pop();
        System.out.println("MIddel "+ s.findMiddle());
        s.pop();
        System.out.println("MIddel "+ s.findMiddle());
        s.pop();
        System.out.println("MIddel "+ s.findMiddle());
        s.pop();
        System.out.println("MIddel"+ s.findMiddle());
        System.out.println(s.deleteMiddle());
        System.out.println(s.findMiddle());

    }
}
