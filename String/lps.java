package String;

public class lps {
    void lps(String s){
      int i=1;
      int j=0;
      
      int[]lps=new int[s.length()];
      lps[0]=0;
      while(i<s.length()){
        if (s.charAt(i)==s.charAt(j)){
            lps[i]=lps[i-1]+1;
            i++;
            j++;
        }else if (j==0){
           lps[j]=0;
           i++;
        }else{
            j=lps[j-1];
        }
      }
      for (int iterater : lps) {
        System.out.print(iterater+" ");
      }
    }
    
    public static void main(String[] args) {
        String str="aabaddacaabs";
        lps lp=new lps();
        lp.lps(str);
    }
}
