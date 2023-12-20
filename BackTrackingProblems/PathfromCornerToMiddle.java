package BackTrackingProblems;

public class PathfromCornerToMiddle {

    public static int xMove[]={0,1,0,-1};
    public static int yMove[]={-1,0,1,0};

    public static void findPathInMaze(int[][]maze,int i,int j,String ans,boolean[][]visited){
        if(i<0||j<0||i>=maze.length||j>=maze[0].length||visited[i][j])return;
        if(i==maze.length/2 && j==maze[0].length/2){
            ans+= "("+i+","+j+")->MID";
            System.out.println(ans);
            return;
        }
        int n=maze[i][j];
        for(int k=0;k<4;k++){
            visited[i][j]=true;
            findPathInMaze(maze,i+n*yMove[k],j+n*xMove[k],ans+"("+i+","+j+")->",visited);
            visited[i][j]=false;
        }
    }
    public static void main(String[] args) {
        int[][] maze = {
            { 3, 5, 4, 4, 7, 3, 4, 6, 3 },
            { 6, 7, 5, 6, 6, 2, 6, 6, 2 },
            { 3, 3, 4, 3, 2, 5, 4, 7, 2 },
            { 6, 5, 5, 1, 2, 3, 6, 5, 6 },
            { 3, 3, 4, 3, 0, 1, 4, 3, 4 },
            { 3, 5, 4, 3, 2, 2, 3, 3, 5 },
            { 3, 5, 4, 3, 2, 6, 4, 4, 3 },
            { 3, 5, 1, 3, 7, 5, 3, 6, 4 },
            { 6, 2, 4, 3, 4, 5, 4, 5, 1 }
        };
        boolean visit[][]=new boolean[maze.length][maze[0].length];
        findPathInMaze(maze,0,0,"",visit);
        findPathInMaze(maze,maze.length-1,0,"",visit);
        findPathInMaze(maze,0,maze[0].length,"",visit);
        findPathInMaze(maze,maze.length-1,maze[0].length,"",visit);
    }
}
