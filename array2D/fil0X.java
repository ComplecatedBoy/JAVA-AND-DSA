package array2D;

public class fil0X {


    public static void fill(char[][]matrix){
        char ch='X';
        int rowstart=0;
        int colstart=0;
        int rowend= matrix.length-1;
        int colend=matrix[0].length-1;

        while (rowstart<=rowend&&colstart<=colend) {

            for(int i=colstart;i<=colend;i++){
              matrix[rowstart][i]=ch;
            
            }
            for(int i=rowstart+1;i<=rowend;i++){
            matrix[i][colend]=ch;

            }
            for(int i=colend-1;i>=colstart;i--){
                if(rowstart==rowend)break;
              matrix[rowend][i]=ch;

            }
            for(int i=rowend-1;i>=rowstart+1;i--){
                if(colstart==colend)break;
                  matrix[i][colstart]=ch;
            }
            
            if(ch=='X')ch='O';
            else ch='X';
            colstart++;
            rowstart++;
            colend--;
            rowend--; 
        }
            
        }

    public static void main(String[] args) {
        char [][] matrix=new char[10][3];
        fill(matrix);
      


    for(int i=0;i<matrix.length;i++ ){
        for(int j=0;j<matrix[0].length;j++){
           System.out.print(matrix[i][j]+" ");
       }
       System.out.println();
}
    }}
