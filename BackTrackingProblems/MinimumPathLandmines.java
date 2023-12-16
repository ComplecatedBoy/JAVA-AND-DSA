package BackTrackingProblems;
import java.util.*;

public class MinimumPathLandmines {


   public static int solver(int[][]matrix,int i,int j,int currans,boolean[][]visited){
       if (i<0||j<0||i>=matrix.length||visited[i][j]==true||matrix[i][j]!=1) {
           return Integer.MAX_VALUE;
       }else if(j==matrix[0].length-1){
        return currans;
       }
        visited[i][j]=true;
        int a=solver(matrix, i, j+1, currans+1,visited);
        int b=solver(matrix, i+1, j, currans+1,visited);
        int c=solver(matrix, i-1, j, currans+1,visited);
        int d=solver(matrix, i, j-1, currans+1,visited);
        currans=Math.max(currans,Math.min(a,Math.min(b, Math.min(c,d))));
        visited[i][j]=false;
       return currans;
    }



     public static void findshortestpath(int[][]matrix){
        int ans=Integer.MAX_VALUE;
        int N=matrix.length;
        int M=matrix[0].length;
        boolean[][]visited= new boolean [matrix.length][matrix[0].length];
        for (boolean[] bool : visited) {
           Arrays.fill(bool,false);
        }
          
        for (int j=0;j<N;j++) {
            for(int i=0;i<M;i++){
                if (matrix[j][i]==0) {
                     if (i-1>=0)matrix[j][i-1]=-1;
                     if(i+1<M)matrix[j][i+1]=-1;
                     if(j-1>=0)matrix[j-1][i]=-1;
                     if(j+1<N)matrix[j+1][i]=-1;
                }
            }
        } for (int j=0;j<N;j++) {
            for(int i=0;i<M;i++){
                if (matrix[j][i]==-1) {
                    matrix[j][i]=0;
                }
            }
        }   for (int index = 0; index <matrix.length; index++) {
            int curr=solver(matrix,index,0,0,visited);
             ans=Math.min(curr,ans);
        }
        
        System.out.println(ans);
        // printmatrix(matrix);
     }
    public static void main(String[] args) {
        // int[][]matrix=
        //     {
        //         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
        //         { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
        //         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        //         { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
        //         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        //         { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }
        //     };


        int matrix[][]=
        {
            {1,1,1,1,1,1,1,1},
            {1,1,1,1,0,1,1,1},
            {1,0,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1},
            {1,1,1,1,0,1,1,1},
            {1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1}

        };
            findshortestpath(matrix);
        
    }

    public static void printmatrix(int[][]matrix){
        System.out.println("----------------------------------------------------------------------");
        for (int[] ele : matrix) {
            for (int i : ele) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
}
