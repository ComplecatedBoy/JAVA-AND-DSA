package BackTrackingProblems;
import java.util.*;
public class Longestroutes {
     public static boolean issafe(int[][]mat,boolean[][]map,int i ,int j){
     if( i<0||j<0||i==mat.length||j==mat[0].length||map[i][j]==true||mat[i][j]==0)
     return false;
        return true;
     }

      public static int getlongestpath(int[][]mat,boolean[][]map,int i,int j,int di,int dj){
          //base case
          if (i==di&&j==dj) {
            return 0;
          }
          int curans=0;
          if(issafe(mat, map, i, j))
            { map[i][j]=true;
            curans= Math.max(curans, getlongestpath(mat, map, i+1, j, di, dj)+1);
            curans= Math.max(curans, getlongestpath(mat, map, i-1, j, di, dj)+1);
            curans= Math.max(curans, getlongestpath(mat, map, i, j+1, di, dj)+1);
            curans= Math.max(curans, getlongestpath(mat, map, i, j-1, di, dj)+1);
            // map[i][j]=false;
           }
         return curans;
      }




       public static void findLongestPath(int[][]mat,int si,int sj,int di,int dj){
          int ans=0;
          boolean[][] map=new boolean[mat.length][mat[0].length];
          for (boolean[]  bool : map) {
                Arrays.fill(bool,false);
          }
           

          ans=getlongestpath(mat,map,si,sj,di,dj);

          if (ans==0) {
            System.out.println("can't be reached");
          }else{
            System.out.println(" the longest possible path length is "+ans);
          }
       }
    public static void main (String[] args) {
 
        int mat[][] = {{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                       { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
                       { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

        findLongestPath(mat, 0, 0, 2, 7);
     
      }

}
