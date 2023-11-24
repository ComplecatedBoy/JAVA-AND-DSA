package String;

public class ConvertToMo {
    public static void covert(String s){
        int arr[]={'A','D','G','J','M','P','T','W'};
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch==' ') {
                sb.append(0);
                continue;
            }
            for (int j = arr.length-1; j>=0; j--) {
                if (ch>=arr[j]){
                    int k=ch-arr[j];
                    while(k>=0){
                        sb.append(j+2);
                        k--;
                    };
                    break;
                }
            }
        }System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s="BMDKSMKLMDKLGMKLSDMG";
        covert(s);
    }
    
}
