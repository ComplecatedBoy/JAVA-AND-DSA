package String;

public class SmallestWindow {

    public static void smallestwindow(String str1,String str2){
        int n=str1.length();
        int count=0;
        int map[]=new int[256];

        for(int k=0;k<str2.length();k++){
            map[str2.charAt(k)]++;
            count++;
        }
        for (int  k : map) {
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println(count);
        int j =0;
        int i=0;
        int ans=Integer.MAX_VALUE;
        int start=0;
        while(i<n){
            
            map[str1.charAt(i)]--;
            if (map[str1.charAt(i)]>=0) {
                count--;
            }
            if (count==0) {
                  System.out.println(str1.substring(j,i));
                 System.out.println("reached here");
                while (count==0) {
                    if((i-j)<ans){
                        ans=i-j;
                        start=j;
                    }
                  
                    map[str1.charAt(j)]++;
                    if (map[str1.charAt(j)]>0) {
                        count++;
                    }
                    j++;
                }
            }
             i++;
        }

        System.out.println("the ans is "+ans+" "+start);
        System.out.println(str1.substring(start, start+ans+1));
        



    }
    
     public static void main(String[] args) {
        String str1="a";
        String str2= "aa";
        smallestwindow(str1,str2);
     }
}
