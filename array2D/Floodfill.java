package array2D;

public class Floodfill {


     public static void floodfillo(char[][]mat,int x , int y,int row ,int col){
        //base case
    
          
        if(x<0||y<0||x==row+1||y==col+1||mat[x][y]!='-'){
            return;
        }

        //recursion 
         if(mat[x][y]=='-'){
            mat[x][y]='O';
            floodfillo(mat,x-1,y,row ,col);
            floodfillo(mat,x,y-1,row,col);
            floodfillo(mat,x+1,y,row,col);
            floodfillo(mat,x,y+1,row,col);
         }
    }


    public static void replaceSurrounded( char[][]mat,int row,int col){
        for (int i = 0; i <=row; i++) {
            for (int j = 0; j <=col; j++) {
                if(mat[i][j]=='O')mat[i][j]='-';
            }
        }
           
        for (int index = 0; index <=col; index++) {
            if (mat[0][index]=='-') {
              floodfillo(mat,0,index,row,col);
            }
        }
        for (int index = 1; index <=row; index++) {
            if (mat[index][col]=='-') {
                 floodfillo(mat,index,col,row,col);
            }
        }
        for (int index = col-1 ; index >=0; index--) {
            if (mat[row][index]=='-') {
                floodfillo(mat,row,index,row,col);
            }
        }
        for (int index = row; index>0; index--) {
            if (mat[index][0]=='-') {
               floodfillo(mat,index,0,row,col);
            }
        }



         for (int i = 0; i <=row; i++) {
            for (int j = 0; j <= col; j++) {
                if(mat[i][j]=='-')mat[i][j]='X';
            }
        } 
    }
    public static void main (String[] args)
    {



        System.out.println((int)'('+" "+(int)')');
         System.out.println((int)'{'+" "+(int)'}');
         System.out.println((int)'['+" "+(int)']');
        
        char[][] mat = {{'X', 'O', 'X', 'X', 'X', 'X'},
                        {'X', 'O', 'X', 'X', 'O', 'X'},
                        {'X', 'X', 'X', 'O', 'O', 'X'},
                        {'O', 'X', 'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'O'},
                        {'O', 'O', 'X', 'O', 'O', 'O'},
       };
        int M= mat.length-1;
        int N= mat[0].length-1;
                         
        replaceSurrounded(mat,M,N);
     
        for (int i = 0; i <=M; i++)
        {
            for (int j = 0; j <= N; j++)
                System.out.print(mat[i][j] + " ");
                 
            System.out.println("");
        }
    }
}
