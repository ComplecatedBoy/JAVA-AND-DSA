package BackTrackingProblems;

 class Findsubsets{
    
    public static void printsubse(String str, String ans ,int i ){
     if(i==str.length()){
        if (ans.length()==0) {
           System.out.println("null"); 
           return;
        }
        System.out.println(ans);
             return;
     }


        printsubse(str, ans, i+1);
        printsubse(str, ans+str.charAt(i), i+1);

    }
    public static void main(String[] args) {
        String str="abcedddfffdsdff";
        printsubse(str,"",0);
    }
}
