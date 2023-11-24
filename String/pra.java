package String;
import java.util.*;

class pra{

// Function
static String Minimum_Window(char []s, char []t)
{  
    int map[]=new int[256];
    int ans=Integer.MAX_VALUE;
    int start=0;
    int count=0;

    for (int index = 0; index < t.length; index++) {
        if(map[t[index]]==0)count++;
         map[t[index]]++;
    }
    

    int i=0;int j=0;
    
    for (int index = 0; index < s.length; index++) {
        map[s[index]]--;
        if (map[s[index]]==0) {
            count--;
        }
        
        if (count==0) {
            while(count==0){
                if(ans>j-i+1){
                    ans=j-i+1;
                    start=i;
                }
                
               map[s[i]]++;
               if(map[s[i]]>0) {
                count++;
               }
                i++;
               } 
            }
            j++;
        }

    
    
    
    if (ans != Integer.MAX_VALUE)
    return  String.valueOf(s).substring(start, ans+start);
else
    return "-1";

    
}

public static void main(String[] args) 
{
    String s = "SADOBECODEBANC";
    String t = "ABC";
    
      System.out.print("-->Smallest window that contain all character : ");
    System.out.print(Minimum_Window(s.toCharArray(), t.toCharArray()));

}
}

