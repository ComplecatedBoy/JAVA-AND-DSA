package BackTrackingProblems;

public class FindGridways {
    public static int gridways(int x, int y , int n ,int m){
//base case;
if(x==n-1&&y==m-1)return 1;
else if(x==n||y==m)return 0;

    return gridways(x+1,y,n,m)+gridways(x, y+1, n, m);
    }
    public static void main(String[] args) {
        int n=10,m=20;
       System.out.println(gridways(0,0,n,m));
    }
}
