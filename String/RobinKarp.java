package String;

public class RobinKarp {
    private static int d= 256;

 public static void robinkarpsearch(String text, String pat , int q){
    int n = text.length();
    int m = pat.length();

    int p=0;
    int t=0;

    int h=1;
           for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;
    

            for(int i=0; i< m;i++){
                p=(p*d+pat.charAt(i))%q;
                t=(t*d+text.charAt(i))%q;
            }

    for(int i=0; i<n-m+1;i++){

        if (p==t){
            int j;
            for( j=0;j<m;j++){
                if (text.charAt(j)!=pat.charAt(j)) {
                    break;
                }
            }
            if (j==m) {
                System.out.println("the pattern is foound at " + i);
            }
        }
        if (i<n-m) {
            t = (d * (t - text.charAt(i) * h)
                     + text.charAt(i + m))
                    % q;
             if(t<0)t+=q;
        }
    }
 }
    public static void main(String[] args) {
        String text = "GEEKS FOR GEEKS";
        String pat="GEEK";
        
        robinkarpsearch(text,pat,101);
    }
}
