package array2D;

public class Findcommon {
      public static boolean checknumber(int[][]mat,int num,int row,int firstlargest,int lastlowest){
       //base case;
       if(row == mat.length){
        return true;
       }
        //recursion;
        for (int i=0;i<mat[0].length;i++){
            if (mat[row][i]<=lastlowest && mat[row][i]>=firstlargest && mat[row][i]==num) {
             return checknumber(mat, num, row+1, firstlargest, lastlowest);
            }
        }
        
        return false;
      }

    public static int findCommon(int[][]mat){
        int n=mat.length;
        int m=mat[0].length;
        int firstlargest=Integer.MIN_VALUE;
        int lastlowest=Integer.MAX_VALUE;
           
        for (int i = 0; i<n; i++) {
            if (mat[i][0]>firstlargest) {
                firstlargest=mat[i][0];
            }
            if (mat[i][m-1]<lastlowest) {
                lastlowest=mat[i][m-1];
            }
        }
        System.out.println(firstlargest+" "+lastlowest);

        for (int i = 0; i < m; i++){
            if (mat[0][i]>= firstlargest&& mat[0][i] <=lastlowest) {
                if (checknumber(mat,mat[0][i],1,firstlargest,lastlowest)) {
                    return mat[0][i];
                }
            }
        }
        return -1;
    }



    public static void main(String[] args)
    {
        int mat[][] = { { 1, 2, 3, 4, 5 },
                        { 2, 4, 5, 8, 10 },
                        { 3, 5, 7, 9, 11 },
                        { 1, 3, 5, 7, 9 } };
        int result = findCommon(mat);
        if (result == -1)
            System.out.print("No common element");
        else
            System.out.print("Common element is " + result);
    }
}
