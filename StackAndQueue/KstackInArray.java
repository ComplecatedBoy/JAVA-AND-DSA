package StackAndQueue;

public class KstackInArray {
    static class kStack{

        int[]arr;
        int free;

        int[]top;
        int[]next;
        int n,k;

        kStack(int k,int n){
            this.n=n;
            this.k=k;

            arr=new int[this.n];
            top=new int[this.k];
            next=new int[this.n];

            init();
        }
        private void init(){
            free=0;
            for(int i=0;i<k;i++){
                top[i]=-1;
            }
            for(int i=0;i<n;i++){
                next[i]=i+1;
            }
        }

        public boolean isFull(){
            return free==this.n;
        }
        public boolean isEmpty(int k){
            return top[k]==-1;
        }

        public void push(int val,int k){
            if(isFull()){
                System.out.println("Stack overflow...");
                return;
            }

            int i=free;
            free=next[i];
            next[i]=top[k];
            top[k]=i;
            arr[i]=val;
        }

        public int pop(int k){
            if(isEmpty(k)){
                System.out.println("The stack is Empty");
                return -1;
            }
            int i=top[k];
            top[k]=next[i];

            next[i] = free;
            free = i;

            return arr[i];
        }

        public int peek(int k){
            if(isEmpty(k)){
                System.out.println(k+"th Stack is Empty");
                return -1;
            }
            return arr[top[k]];
        }
    }
    public static void main(String[] args) {
        int k = 3, n = 10;
         
        kStack ks = new kStack(k, n);
 
        ks.push(15, 2);
        ks.push(45, 2);
 
        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);
 
        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);
 
        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
}
