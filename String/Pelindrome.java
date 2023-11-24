//Check if the String is Palindrome.

package String;


import java.util.*;
public class Pelindrome{
    public static boolean isPalindrome(String str){
        
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            return false;
        }
        return true;
    }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);

        String str=sc.next();
        if(isPalindrome(str))
            System.out.println("The given string is Palindrome.");
         else
        System.out.println("The given string is not a Palindrome.");

        System.out.print(str);
    }
    
}
