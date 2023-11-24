package String;

import java.util.*;

public class Strings{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");

        }System.out.println();
    }
    public static void main(String args []){

        char arr[]={'a','b','c','d','e'};

        String str="abcd";
        String str2=new String("xyz@1234");

        //Strings are IMMUTABALE 

        // Scanner sc= new Scanner (System.in);
        // String name;
        // name =sc.nextLine();
        // System.out.println(name);

        String fulName="SATYAM KUMAR SHAH ";
        String lastName=" EC-B";
        System.out.println(fulName.length());
        
        String student=fulName+lastName;
        System.out.println(student);//concatanation

        printletters(student);

    
    }
}
