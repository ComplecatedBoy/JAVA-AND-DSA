package String;

public class Removeconsecutive {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");

        String s= "aabb";
        char prev= s.charAt(0);
        sb.append(prev);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)!=prev) {
                prev=s.charAt(i);
                sb.append(s.charAt(i));
                
            }
        }

        System.out.println(sb);
    }
}
