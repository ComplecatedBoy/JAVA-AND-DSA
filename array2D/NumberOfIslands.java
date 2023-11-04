package array2D;

public class NumberOfIslands {
    static int count =0;
    public static void main(String[] args)
    {
        int[][] M = { { 0,1,0,0,1,0 },
                      { 0,0,0,0,1,0 },
                      { 0,0,1,0,0,0,}};
 
        System.out.print("Number of islands is: "
                         + countIslands(M));
    }

    public static int countIslands(int[][]M){
       int  n=M.length;
       int  m=M[0].length;

       for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if(M[i][j]==1){
                count++;
                Dfs(M,i,j);
            }
        }
       }
        return count;
    }

   public  static void Dfs(int [][]M,int i ,int j){
      
if (i<0||j<0||i==M.length||j==M[0].length||M[i][j]!=1) {
    return;
}

    //recursion
    if (M[i][j]==1) {
        M[i][j]=0;
       Dfs(M, i+1, j);
       Dfs(M, i, j+1);
       Dfs(M, i-1, j);
       Dfs(M, i, j-1);
       Dfs(M, i+1, j+1);
       Dfs(M, i-1, j-1);
       Dfs(M, i+1, j-1);
       Dfs(M, i-1, j+1);   
    }
    }
}
