package StackAndQueue;

import java.util.*;

public class JobSequencingProblem {

    static class  Job implements Comparable<Job>{
        char Job_id;
        int deadline;
        int profit;
        Job(char Job_id,int deadline,int profit){
            this.Job_id=Job_id;
            this.deadline=deadline;
            this.profit=profit;
        }
        @Override
        public int compareTo(Job o) {
            return o.profit-this.profit;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Job>jobs=new PriorityQueue<>();

        // jobs.add(new Job('a', 4, 20));
        // jobs.add(new Job('b', 1, 10));
        // jobs.add(new Job('c', 1, 40));
        // jobs.add(new Job('d', 1, 30));
        // jobs.add(new Job('e', 4, 20));
        // jobs.add(new Job('f', 2, 50));
        // jobs.add(new Job('g', 1, 40));
        // jobs.add(new Job('h', 6, 30));
        // jobs.add(new Job('i', 4, 20));
        // jobs.add(new Job('j', 3, 10));
        // jobs.add(new Job('k', 1, 40));
        // jobs.add(new Job('l', 4, 30));

        jobs.add(new Job('a', 2, 100));
        jobs.add(new Job('b', 1, 19));
        jobs.add(new Job('c', 2, 27));
        jobs.add(new Job('d', 1, 25));
        jobs.add(new Job('e', 3, 15));

        int maxDeadline=0;
        for(Job j:jobs){
            maxDeadline=Math.max(maxDeadline,j.deadline);
        }
        boolean deadline[]=new boolean[maxDeadline];

        int profit=0;

        while(!jobs.isEmpty()){
            Job j=jobs.remove();
            int index=j.deadline;
            while(index-->0){
                if(!deadline[index]){
                    profit+=j.profit;
                    System.out.println(index+" "+j.profit);
                    deadline[index]=true;
                    break;
                }
            }
        }

        for(boolean b: deadline){
            System.out.print(b+" ");
        }
        System.out.println();

        System.out.println(profit);

    }
}
