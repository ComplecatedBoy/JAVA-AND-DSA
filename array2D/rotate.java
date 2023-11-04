package array2D;

public class rotate {
    public static void rot(int[][]matrix){
            int temp;
            
        for(int i=0;i<matrix.length;i++ ){
            for(int j=i;j<matrix[0].length;j++){
                 temp=matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;
            }
        }


        for(int i=0;i<matrix.length;i++ ){
            for(int j=0;j<matrix[0].length/2;j++){
                  temp=matrix[i][j];
                  matrix[i][j]=matrix[i][matrix[0].length-1-j];
                  matrix[i][matrix[0].length-1-j]=temp;
            }
        }
                for(int i=0;i<matrix.length;i++ ){
                    for(int j=0;j<matrix[0].length;j++){
                       System.out.print(matrix[i][j]);
                   }
                   System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};

            rot(matrix);
    }
}
