package String;

public class countpalindrom {
    private  static int count=0;

    public static int findnopali(String s){
        for (int i = 0; i <s.length(); i++) {
        count+= expandfmiddle(s,i,i);
        count+= expandfmiddle(s,i,i+1);
        }
        return count;
    }

    public static int expandfmiddle(String s , int start , int end){
        int no=0;
        while (start>=0 && end<s.length()) {
            if (s.charAt(start)!=s.charAt(end)) {
                break;
            }else{
                no++;
            }
            start--;
            end++;
        }
     return no;
    }




    public static void main(String[] args) {
        String str="aaa";
        System.out.println(findnopali(str));
    }
}


