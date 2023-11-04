package array2D;

public class DigoSum {
    
    public static int sumofdigo(int matrix[][]){
        int i=0; int j=matrix.length-1;
        int sum =0;
        while(i<matrix.length){
           sum += matrix[i][i];
           if(i!=j){
            sum+=matrix[i][j];
           }
           i++;
           j--;
        }
        return sum;
    }

    public static void main (String args []){

        int matrix[][]={{1,2,3},{2,3,4},{3,4,5}};
      System.out.print("The sum of the diagonal is :" +sumofdigo(matrix));
    }
    
}
