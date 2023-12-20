package BackTrackingProblems;
import java.util.*;

public class RatMaze {


    // public static boolean issafe(int[][]maze,int i , int j, int M,int N){
    //     if(i<0||j<0||i==M||j==N||maze[i][j]==0)return false;
    //     return true;
    // }


    // public static boolean mazesolver(int[][]maze,int i,int j, int M, int N,int[][]output){
    
    //    if (i==M-1&&j==N-1&&maze[i][j]==1) {
    //     output[i][j]=1;
    //      return true;
    //    }

    //    if(issafe (maze,i,j,M,N)){

    //     if(output[i][j]==1)return false;

    //     output[i][j]=1;
    //     if (mazesolver(maze,i-1,j,M,N,output)) {
    //         return true;
    //     }
        
    //     if (mazesolver(maze,i+1,j,M,N,output)) {
    //         return true;
    //     }
    //     if (mazesolver(maze,i,j-1,M,N,output)) {
    //         return true;
    //     }
    //     if (mazesolver(maze,i,j+1,M,N,output)) {
    //         return true;
    //     }
    //      output[i][j]=0;
    //    }
    //     return false;
    // }



    // public static void printmaze(int[][]maze){
    //     for (int[] arr : maze) {
    //        for (int num : arr) {
    //           System.out.print(num+" ");
    //        }
    //        System.out.println();
    //   }
    // }
    // public static void SolveMaze(int[][]maze,int M,int N){
    //   int output[][]=new int[M][N];
    // //   Arrays.fill(output,0);
    //   for (int[] arr : output) {
    //     Arrays.fill(arr,0);
    //     //    for (int i : arr) {
    //     //       System.out.print(i+" ");
    //     //    }
    //     //    System.out.println();
    //   }

    //   if (mazesolver(maze,0,0,M,N,output)) {
    //     printmaze(output);
    //   }else{
    //     System.out.println("There is no solution");
    //   }
    // }
    public static void main(String[] args) {
   int maze[][] ={{1, 0, 0, 0},
   {1, 1, 0, 1}, 
   {1, 1, 0, 0},
   {0, 1, 1, 1}};

    int M=maze.length;
    int N=maze[0].length;
    System.out.println(SolveMaze(maze,M ,N));
    }

    //One More Try..
    public static String directions="DRUL";
    public static int[]xdir={0,1,0,-1};
    public static int[]ydir={1,0,-1,0};

    public static List<String> SolveMaze(int[][]maze,int M,int N){
      boolean visited[][]=new boolean[M][N];
      StringBuilder sb=new StringBuilder("");
      List<String>ans=new ArrayList<>();
      solve(maze,0,0,M,N,visited,sb,ans);
      return ans;
    }

    public static void solve(int[][]maze,int i,int j,int M,int N,boolean[][]visited,StringBuilder sb,List<String>ans){
      if(i==M-1&&j==N-1&&maze[i][j]==1){
        ans.add(sb.toString());
        return;
      }
      if(i<0||i==M||j<0||j==N||visited[i][j]||maze[i][j]==0)return;
      visited[i][j]=true;
      for(int dir=0;dir<4;dir++){
          sb.append(directions.charAt(dir));
          solve(maze, i+ydir[dir], j+xdir[dir], M, N, visited, sb,ans);
          sb.deleteCharAt(sb.length()-1);
      }
      visited[i][j]=false;
    }
    }