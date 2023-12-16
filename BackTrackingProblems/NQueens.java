package BackTrackingProblems;

public class NQueens {
      static int count= 0;

    public static void printboard(char board[][]){
        System.out.println(" -------------------one solution---------------------");
        int n=board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(char[][]board,int row ,int col ){
       
        for (int j=row-1; j>=0; j--) {
           if (board[j][col]=='Q') {
            return false;
           }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;j--,i--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
         for(int i=row-1,j=col+1;i>=0&& j<board.length;j++,i--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;


    }

    public static void nqueens(char board[][],int row){
    //base case 
    if (row==board.length) {
        count++;
        printboard(board);
        return;
    }
    //recursion
    for (int i = 0; i < board.length; i++){
       if (issafe(board,row,i)){
               board[row][i]='Q';
               nqueens(board, row+1);
               board[row][i]='X'; }}

    }


     


    
    public static void main(String[] args) {
        int n=3;
        char [][]board= new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        printboard(board);

        nqueens(board,0);
        System.out.print(count);
    }
}
