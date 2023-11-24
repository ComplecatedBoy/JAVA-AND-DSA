package String;

public class Wildcardmatching {
    

    public static void main(String[] args) {
        String str1="geeks";
        String str2="ge*ks";

        int n= str1.length();
        int m=str2.length();

        int i=0;
        int j=0;
        for ( i=0; i < str2.length(); i++) {
            if (str2.charAt(i)=='*') {
                break;
            }
            if (str1.charAt(i)!=str2.charAt(i)&&str2.charAt(i)!='?') {
                 System.out.println(false);
            }
        }

        for(j=0;j<m;j++){
          if (str2.charAt(m-1-j)=='*') {
            break;
          }
          if (str1.charAt(n-1-j)!=str2.charAt(m-1-j)&&str2.charAt(m-1-j)!='?') {
            System.out.println(false);
          }
        }
        
        if ((i+j==m-1)&&(i+j<=n)) {
            System.out.println("true");
        }



    }
}
