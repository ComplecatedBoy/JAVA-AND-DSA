package Greedy;

public class PaperCutMinimumSquare {

    public static int solve(int height,int width){
        if(height==1)return width;
        return solve(width%height, height)+width/height;
    }
    public static void main(String[] args) {
        int height= 13;
        int width= 29;
        System.out.println(solve(height,width));
    }
}
