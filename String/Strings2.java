package String;

public class Strings2 {
    public static void main (String args[]){
        String str1="Ram";
        String str2="Ram";
        String str3=new String("Ram");



        // if(str1==str2){
        //     System.out.println("strings are equals");
        // }else{
        //     System.out.println("The string are not equals");
        // }
        //says equals



        // if(str1==str3){
        //     System.out.println("Strings are equals");

        // }else{
        //     System.out.println("the strings are not equals");

        // }
        //says not equals

            if(str1.equals(str3)){
            System.out.println("Strings are equals");

        }else{
            System.out.println("the strings are not equals");

        }

        String str4="SATYAM KUMAR SHAH";
        System.out.println(str4.substring(2));
        System.out.println(str4.substring(2,8));
        

    }
    
}
