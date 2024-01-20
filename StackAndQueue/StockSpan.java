package StackAndQueue;
import java.util.*;
public class StockSpan {

    public static void findSpan(int[]stock,int[]span){
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stock.length;i++){
            while(!s.isEmpty()&&stock[s.peek()] <= stock[i]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-s.peek();
            }
            s.push(i);
        }
    }

    

    
    public static void main(String[] args) { 
        int stock[] ={100,80,60,70,60,85,100};
        int span[]=new int[stock.length]; 
        
        findSpan(stock,span);

        for(int i:span){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
