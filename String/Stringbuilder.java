package String;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");

        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        //O(26)

        System.out.println(sb);
        System.out.println(sb.length());

    }
    
}
