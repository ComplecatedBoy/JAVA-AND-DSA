
public class LinearSearch {

    public static void PrintArr(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    
    public static void search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0 ;j<matrix[0].length;j++){
                if (matrix[i][j]==key){
                    System.out.println("("+i+","+j+")");
                
                }
            }
          }
    }
    public static void main(String[] args) {
    
        int matrix[][]={{1,2,3,4},
                        {2,3,4,5},
                        {3,4,5,6}};
        PrintArr(matrix);
        int key=5;
        search(matrix,key);
}
}
