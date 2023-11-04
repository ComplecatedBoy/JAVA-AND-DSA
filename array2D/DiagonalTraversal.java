package array2D;

public class DiagonalTraversal {
    public static void Zigzag(int[][]arr){

         for(int k=0;k<=arr.length-1;k++){
            for(int i=k,j=0;i>=0 &&j<arr[0].length;i--,j++ ){
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }

         for(int k=1;k<=arr[0].length-1;k++){
            for(int i=arr.length-1,j=k ; i>=0 && j<arr[0].length ; i--,j++ ){
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
         
       
    }

    public static void main(String[] args) {
        int[][]matrix={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12}};

            Zigzag(matrix);
    }
    
}
