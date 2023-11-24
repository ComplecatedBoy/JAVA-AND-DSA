package String;

public class Transformstr {
    public static void main(String[] args) {
        String str1= "abd",str2="bad";
        int res=0;
        int i=str2.length()-1;
        int j=str1.length()-1;
        while(i>=0) {
            if(str1.charAt(j)==str2.charAt(i)){
                j--;
            }else
            res++;

            i--;
        }
      System.out.println(res);
    }
}
