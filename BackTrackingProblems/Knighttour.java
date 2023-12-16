package BackTrackingProblems;

public class Knighttour {
  public static  boolean found=false;

    public static void solve(int[][]ans,int i,int j,int count,int N){
       if (i<0||i>=N||j<0||j>=N||ans[i][j]!=(-1)||found==true) {
          // System.out.println("back");
          return;
       }else if(count==63){
        ans[i][j]=63;
        found=true;
        printBoard(ans);
        return;
       }

       ans[i][j]=count;
       solve(ans, i-2, j+1, count+1, N);
       solve(ans, i-1, j+2, count+1, N);
       solve(ans, i+1, j+2, count+1, N);
       solve(ans, i+2, j+1, count+1, N);
       solve(ans, i+2, j-1, count+1, N);
       solve(ans, i+1, j-2, count+1, N);
       solve(ans, i-1, j-2, count+1, N);
       solve(ans, i-2, j-1, count+1, N);
       ans[i][j]=-1;
       return;
      //
    }

    public static void knighttour(int N){
        int[][]board=new int[N][N];
        for (int[] ele : board) {
           for (int i=0;i<ele.length;i++) {
                ele[i]=-1;
           }
        }
        printBoard(board);


        solve(board, 0,7, 0, N);
          // for (int i = 0; i < N; i++) {
          //   for(int j=0;j<N;j++){
          //    solve(board,i,j,0,N);
          //   }
          // }
        }

        
    
    public static void main(String[] args) {
        int N=8;
        knighttour(N);
    }
    public static void printBoard(int[][]board){
      System.out.println();
      System.out.println("--------------------------------------------------------------------");
      for (int[] ele : board) {
         for (int it : ele) {
          System.out.print(it+" ");
         }
         System.out.println();

      }
    }
}
