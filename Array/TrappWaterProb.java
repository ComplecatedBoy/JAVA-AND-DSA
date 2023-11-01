package array;
import java.util.*;

class TrappWaterProb {

public static int calctrapw( int bars[]) {
    int left[]=new int[bars.length];
    int right[]=new int[bars.length];
    int trappedwater=0;

    for ( int i =0 ; i<bars.length;i++){
        int rightmax=Integer.MIN_VALUE;
        for (int j =i; j < bars.length ; j++){
            if (rightmax < bars[j]){
                rightmax=bars[j];
            }
        }
        int leftmax = Integer.MIN_VALUE;
        for (int j =i; j>=0 ;j--){
            if(leftmax<bars[j])
            {
                leftmax=bars[j];
            }
        }   
        right[i]=rightmax;
        left[i]=leftmax;
    }
    for(int i=0;i<bars.length;i++){
        trappedwater+= Math.min(right [i],left[i])-bars[i];
    }
    return trappedwater;
}


public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the no 0f bars");
    int length = sc.nextInt();
    int bars[]=new int[length];
    for(int i =0;i<length;i++)
    {
        bars[i]=sc.nextInt();
    }
    int Trappwater=calctrapw(bars);
    System.out.println("Total trapped Water is :" + Trappwater);
}  
}