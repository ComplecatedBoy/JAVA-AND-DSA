package array2D;

public class SpiralMatrix {

    public static void sprint(int matrix [][]){

        int startrow=0,startcol=0;
        int endrow= matrix.length-1, endcol =matrix[0].length-1;


    while( startrow<= endrow&& startcol<=endcol ){
 
        for(int j=startcol;j<=endcol;j++){
         

            System.out.print(matrix[startrow][j]+" ");
        }
        for (int i=startrow+1;i<=endrow;i++){

            System.out.print(matrix[i][endcol]+" ");
        }
        for (int j=endcol-1;j>=startcol;j--){
            if ( startrow==endrow ){
                break;
              }
            System.out.print(matrix[endrow][j]+" ");
        }
        for (int i=endrow-1;i>startrow;i--){
            if ( startcol==endcol ){
                break;
              }

            System.out.print(matrix[i][startcol]+" ");
        }
         
         
        startrow++;
        startcol++;
        endrow--;
        endcol--;
    }
}


    public static void main (String args []){

        int matrix[][]={{1,2,6,7},
                        {11,12,16,17},
                        {21,22,56,89}};
        sprint(matrix);

    }
    
}
