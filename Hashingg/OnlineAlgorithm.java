package Hashingg;

public class OnlineAlgorithm {
    
    public static int q=103;
    public static int d=256;

    static void CheckPalindrome(String str){
        int N=str.length();
        System.out.println(str.charAt(0)+" Yes");
        if(N==1)return;

        int firstrev=str.charAt(0)%q;
        int second=str.charAt(1)%q;
       int  h=1;int i,j;

        for(i=1;i<N;i++){
            System.out.println(firstrev+" "+second);
            if(firstrev==second){
                for(j=0;j<i/2;j++){
                    if(str.charAt(i)!=str.charAt(i-j)){
                        break;
                    }
                }
                System.out.println(j==i/2?str.charAt(i)+" Yes":str.charAt(i)+" No");
            }else
            System.out.println(str.charAt(i)+" No");

            if(i!=N-1){
                if(i%2==0){
                    h=h*d%q;
                    firstrev=(firstrev+h*str.charAt(i/2))%q;
                    second=(second*d+str.charAt(i+1))%q;
                }else{
                    second=d*(second+q-str.charAt((i+1)/2)*h)%q+str.charAt(i+1)%q;
                }
            }
        }
    }
    public static void main(String[] args) {
        String str="aabaacaabaa";
        CheckPalindrome(str);

    }
}
