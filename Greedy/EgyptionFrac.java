package Greedy;

public class EgyptionFrac {
    public static void findFrac(int nr , int dr){
        // System.out.println();
        // System.out.println(nr+" "+dr);
       
        if(nr==0){
            return;
        }
        if(nr>dr){
            System.out.print(nr/dr+" + ");
            findFrac(nr%dr, dr);
            return;
        }
        if(dr%nr==0){
            dr=dr/nr;
            nr=1;
        }
        if(nr==1){
            System.out.println(nr+"/"+dr);
            return;
        }
        

        int deno=(int)Math.ceil(dr/(double)nr);
        System.out.print("1/"+deno+" + ");

        int newNumerator=nr*deno-dr;
        int newDenominator=dr*deno;
        findFrac(newNumerator, newDenominator);
    }
    public static void main(String[] args) {
        int nr=12;
        int dr=13;
        findFrac(nr,dr);
    }
}
