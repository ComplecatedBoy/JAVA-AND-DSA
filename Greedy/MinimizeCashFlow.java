package Greedy;

public class MinimizeCashFlow {

    static int getMin(int arr[])
    {
        int minInd = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[minInd])
                minInd = i;
        return minInd;
    }
    static int getMax(int arr[])
    {
        int maxInd = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[maxInd])
                maxInd = i;
        return maxInd;
    }

    static int minOf2(int x, int y) {
        return (x < y) ? x: y;
    }

    public static void minCashFlowRec(int[]amount){

        int mxCredit = getMax(amount), mxDebit = getMin(amount);

        if (amount[mxCredit] == 0 && amount[mxDebit] == 0)
            return;

        int min=minOf2(amount[mxCredit],-amount[mxDebit]);
        amount[mxCredit] -= min;
        amount[mxDebit] += min;

        System.out.println(" person "+mxDebit+" pays "+ min +" to "+ mxCredit);
        minCashFlowRec(amount);
    }


    public static void minCashFlow(int[][]graph){
        int amount[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                amount[i] +=graph[i][j]-graph[j][i];
            }
        }
        minCashFlowRec(amount);
    }
    public static void main(String[] args) {

        int graph[][]={ {0, 1000, 2000},
                        {0, 0, 5000},
                        {0, 0, 0}
                    };
        minCashFlow(graph); 
    }
}
