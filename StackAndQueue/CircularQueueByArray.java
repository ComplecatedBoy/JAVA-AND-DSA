package StackAndQueue;

public class CircularQueueByArray {
    static class CircularQueue{

        int[]arr;
        int rear;
        int front;

        CircularQueue(int n){
            arr=new int[n];
            rear=-1;
            front=-1;
        }

        boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        
        boolean isFull(){
            return (rear+1)%arr.length==front;
        }

        void add(int val){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            rear=(rear+1)%arr.length;
            arr[rear]=val;
            if(front==-1){
                front=0;
            }
        }

        int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int val=arr[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front=(front+1)%arr.length;
            }
            return val;
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        
    }
    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(5);
        q.add(2);
        System.out.println(q.front+" "+q.rear);
        q.add(1);
        System.out.println(q.front+" "+q.rear);
        q.add(5);
        System.out.println(q.front+" "+q.rear);
        q.add(3);
        System.out.println(q.front+" "+q.rear);
        q.add(6);
        System.out.println(q.front+" "+q.rear);
        q.add(7);
        System.out.println(q.front+" "+q.rear);
        while(!q.isEmpty()){
            System.out.println(q.remove()+" "+q.peek());
            System.out.println("heads"+q.front+" "+q.rear);
        }
        q.remove();

    }
}
