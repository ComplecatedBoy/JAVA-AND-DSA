package BackTrackingProblems;
import java.util.*;

public class Hamiltoncycle {

    public static boolean getHamilton(int[][]graph,int i,int j,int[]path,int V){
        if(j>=graph[0].length||graph[i][j]==-1){
            return false;
        }else if(V==graph.length-1 && graph[i][0]==1){
            path[V]=i;
            path[V+1]=0;
            return true;
        }
         
        if (graph[i][j]==1) {
            System.out.println(i+" "+j);
            graph[i][j]=-1;
            path[V]=i;
            if(getHamilton(graph, j, 0, path, V+1))return true;
            path[V]=-1;
        }
        if (getHamilton(graph, i, j+1, path, V))return true;
        return false;
    }

      

     public static  void FindHamiltonCycle(int[][]graph){
        int[]cycle=new int[graph.length+1];
        Arrays.fill(cycle,-1);
        
       if (!getHamilton(graph,0,0,cycle,0)){
        System.out.println("No hamilton cycle");
       }else{
        System.out.println("-------The Hamilton Cycle is------");
        for (int i : cycle) {
            System.out.print(i+" ");
        }
        System.out.println();
       };


     }
    public static void main(String[] args) {
        int[][]graph=
        {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0},
        };
        FindHamiltonCycle(graph);
    }
}
