package array2D;
import java.util.*;

public class Largest{

    public static int Largest(int matrix[][]){
        int lrgst=Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0 ;j<matrix[0].length;j++){
                lrgst=Math.max(lrgst,matrix[i][j]);
               
            }
          }
          return lrgst;
    }


    public static void main (String args[]){

    //    int matrix[][]=new int[4][3];
    
    int matrix[][]={{1,2,3,4},
                    {2,3,4,5},
                    {3,4,5,6}};

    
    System.out.println("The Largest is :"+Largest(matrix));

    }

}
