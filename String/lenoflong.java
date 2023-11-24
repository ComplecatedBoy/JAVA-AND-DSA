package String;

public class lenoflong {
    public static int lengthOfLongestSubstring(String str) {

        boolean [] alphabet=new boolean[128];

        if(str.length()==0||str.length()==1)return str.length();
        int count=0; int ans=0;
        for (int i = 0; i < str.length(); i++){
            
             if(alphabet[str.charAt(i)]){
                 for (int j2 = 0; j2 < alphabet.length; j2++) {
                  alphabet[j2]=false;
                 }
                 alphabet[str.charAt(i)]=true;
                 int j=i-1;
                 count=1;
                 while(str.charAt(j)!=str.charAt(i)){
                       alphabet[str.charAt(j)]=true;
                       count++;
                       j--;
                 }
                 
                
             }else{
                alphabet[str.charAt(i)]=true;
                 count++;
                 ans=Math.max(ans,count);
             }
            }
        
        return ans;
    }
    
    public static void main(String[] args) {
        String str="JVMLOPah";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
