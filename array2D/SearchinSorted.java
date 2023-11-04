package array2D;

public class SearchinSorted {
     
    public static void staircase(int matrix[][],int key){
        
        
        // int i=0,j=matrix[0].length-1;
        // while( i<matrix.length && j>=0 ){
        //     if(matrix[i][j]==key){
        //         System.out.println("found at :("+i+","+j+")");
        //         return;
        //     }else if(matrix[i][j]<key) {
        //         i++;
        //     }else{
        //          j--; 
        //     }
        // }


        int i=matrix.length-1;int j=0;
        while(i>=0 &&j <=matrix.length-1){
            System.out.println(i+""+j);
            if(matrix[i][j]==key){
                System.out.print(" The key is found at : ("+i+","+j+")");
                return;
            }else if (matrix[i][j]>key){
                i--;
            }else{
                j++;
       }
        }





        System.out.print("not found ");





    }

    public static void main (String args[]){
        int matrix[][]={ {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,40},
                        {32,33,39,50}};

             staircase(matrix,41);           
    }
    
}
