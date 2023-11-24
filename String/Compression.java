package String;

public class Compression{

    public static String Docompress(String str){
        StringBuilder sb = new StringBuilder("");
        int count=1;
        char prev=str.charAt(0);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i)==prev){
                count++;
            }else{
             sb.append(prev);
             if(count>1)sb.append(count);
             count=1;
             prev=str.charAt(i);
            }
        }

        sb.append(prev);
        if (count>1){
            sb.append(count);
        }

         return sb.toString();
        }
    

    public static void main(String[] args) {
        String str="aaaakjknnkjhjvhjsb h ggggg hhhh";
        System.out.print(Docompress(str));
    }
    
}
