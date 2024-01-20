package StackAndQueue;

public class QueueByArray {
   static class Queue{
        int arr[];
        int rear;

        Queue(int n){
            arr=new int[n];
            rear=-1;
        }

        boolean isEmpty(){
            return rear==-1;
        }

        boolean isFull(){
            return rear==arr.length-1;
        }

        void add(int n){
            if(isFull()){
                 System.out.println("Queue is fool");
                 return;
            }
            // rear=rear+1;
            // arr[rear]=n;

            rear=rear+1;
            int i=rear;
            while(i>0){
                arr[i]=arr[i-1];
                i--;
            }
            arr[0]=n;
            return;
        }

        int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            // int val=arr[0];
            // int i=0;
            // while(i<rear){
            //     arr[i]=arr[i+1];
            //     i++;
            // }
            // rear=rear-1;
            // return val;
            rear=rear-1;
            return arr[rear+1];
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[rear];
        }
    }
    public static void main(String[] args) {

        Queue q=new Queue(5);
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(3);
        q.add(6);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.remove()+" "+q.peek());

        }
        q.remove();
        
    }
}
