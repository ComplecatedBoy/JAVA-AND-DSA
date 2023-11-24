package String;

public class printDuplitcate {
    public static void print(String str){
        int []alphabet=new int[26];
        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i]>1){
                System.out.println((char)(i+'a')+", count:"+alphabet[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str="geeksgeekkkkkk";
        print(str);
    }
    
}
