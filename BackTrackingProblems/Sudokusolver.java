package BackTrackingProblems;

import java.util.ArrayList;
import java.util.Collections;

public class Sudokusolver {
    public static boolean isvalid(int [][]sudoku,int row,int col,int digit){

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col]==digit){
                return false;
            }
        } 
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i]==digit){
                return false;
            }
        }
       int rs=(row/3)*3;
       int cs=(col/3)*3;

       for (int i = rs; i < rs+3; i++) {
        for (int j = cs; j < cs+3; j++) {
           if (sudoku[i][j]==digit){
                return false;
            }
        }
       }
        return true;
    }


public static boolean solsudoku(int[][]sudoku,int row ,int col){
//base case
if (row==9) {
    return true;  
}

//recursion
 int newrow = row ,newcol=col+1;
 if(col+1==9){
    newrow =row+1;
    newcol=0;
 }
 if (sudoku[row][col]!=0) {
   return solsudoku(sudoku, newrow, newcol);
 }

for (int digit = 1; digit<=9; digit++) {
    if (isvalid(sudoku,row,col,digit)){
        sudoku[row][col]=digit;
        if(solsudoku(sudoku, newrow, newcol)){
            return true;
        }else sudoku[row][col]=0;
    }
  }
    return false;
}

  


    public static void main(String[] args) {
        int[][]sudoku={ { 0,0,0,0,3,0,0,0,0},
        { 0,0,5,0,4,1,9,3,6},
        { 0,0,0,7,0,0,4,1,8},
        {8,4,0,0,0,0,0,2,0},
        { 5,0,0,0,2,0,0,0,4},
        { 0,2,0,0,0,0,0,7,1 },
        { 9,1,3,0,0,6,0,0,0},
        { 6,5,8,1,9,0,3,0,0},
        {0,0,0,0,8,0,0,0,0} };

    printSudo(sudoku);

    solsudoku(sudoku,0,0);
    printSudo(sudoku);

    }

     public static void printSudo(int[][]sudoku){
        System.out.println("------------------------------------------------------------");
           for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
           }
           
    }
    
    
}
