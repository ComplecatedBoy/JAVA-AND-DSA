package BackTrackingProblems;
public class FindLongestRoute {

    static int[] x={0,1,0,-1};
    static int[] y={-1,0,1,0};

    public static boolean isValid(int i,int j,int[][]mat){
        if(i<0||i==mat.length||j<0||j==mat[0].length||mat[i][j]==0)return false;
      return true;
    }
    public static int findLogestRoute(int i,int j,int di,int dj,int[][]mat){
        int cur=0;
        if(i==di&&j==dj)
        return 0;
        mat[i][j]=0;
        for(int dir=0;dir<4;dir++){
            if(isValid(i+y[dir],j+x[dir],mat)){
               cur=Math.max(cur,findLogestRoute(i+y[dir], j+x[dir],di, dj, mat)+1);
            }
        }
        mat[i][j]=1; 
        return cur;
    }
    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }};
        int si=0;
        int sj=0;
        int di=2;
        int dj=7;

        System.out.println(findLogestRoute(si,sj,di,dj,mat));
    }

}
