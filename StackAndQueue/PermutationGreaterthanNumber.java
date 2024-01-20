package StackAndQueue;

import java.util.*;

public class PermutationGreaterthanNumber {

    public static void numbers(int n){
        int i=0;
        int count=0;
        while(i<=n&&i<=9){
            System.out.print(i+" ");
            count++;
            i++;
        }

        for(i=10;i<=n;i++){
            int num=i;

            Stack<Integer>s=new Stack<>();
            s.push(Integer.MAX_VALUE);

            while(num>0){
                int rem=num%10;
                if(rem>s.peek())break;
                s.push(rem);
                num=num/10;
            }

            if(num==0)
            {
              count++;
              System.out.print(i+" ");  
            }  
        }

        System.out.println();
        System.out.println("The Count is : "+count);
    }
    public static void main(String[] args) {
        int n=100;
        numbers(n);
    }
}
