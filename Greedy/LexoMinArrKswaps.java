package Greedy;

public class LexoMinArrKswaps {

    public static void solve(int[]num,int k){
        for(int i=0 ; i<num.length-1 && k>0 ; i++){
            int min=i+1;
            for(int j=i+1;j<num.length && min<k-i-1 ;i++){
                if(num[j]<num[min]){
                    min=j;
                }
            }
            k=k-min;
            while(min>0){
                int temp=num[min];
                num[min]=num[min-1];
                num[min-1]=temp;
                min--;
            }
        }
    }

    


    public static void main(String[] args) {
        int[] num={7, 6, 9, 2, 1};
        int k=1;

        solve(num,k);

        for(int nn:num){
            System.out.print(nn+" ");
        }
    }
}
