package String;

public class ReapetReplcemnt {

    public static int Charrep(String s,int k){
         
        int []frequency= new int[26];

        int mostfrequentletter=0;
        int left=0;
        int ans=0;
          

        for (int right = 0; right < s.length(); right++){
            frequency[s.charAt(right)-'A']++;
            mostfrequentletter=Math.max(mostfrequentletter,frequency[s.charAt(right)-'A']);
            System.out.println(mostfrequentletter);
            System.out.println(left+" "+right);

            if (right-left-mostfrequentletter>=k) {
                frequency[s.charAt(left)-'A']--;
                left++;
            }

            ans=Math.max(ans,right-left+1);
        }






      return ans;
    }
  
    public static void main(String[] args) {
        String s="BBCDEFF";

        System.out.println(Charrep(s, 3));
    }
    
}
