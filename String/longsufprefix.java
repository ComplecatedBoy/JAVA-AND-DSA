package String;

public class longsufprefix {
    public static int findlps(String str){
        int i=0;
        int j=1;
        while (j<str.length()){
            System.out.println(i+" "+j);
            if (str.charAt(i)!=str.charAt(j) && i==0){
                j++;
            }else if( str.charAt(i)==str.charAt(j)){
                i++;
                j++;
            }else{
                i=0;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        String str="acccbaaacccbaac";
        int ans= findlps(str);
        System.out.print(ans);
    }
}
