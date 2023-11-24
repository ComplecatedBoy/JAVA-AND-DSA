package String;

public class ConvertToMobileNumberKeyboard {

    public static String getAns(String[]keys,String str){
        StringBuilder ans=new StringBuilder("");

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')ans.append("0");
            else ans.append(keys[str.charAt(i)-'A']);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] Keys={"2","22","222",
                    "3","33","333",
                    "4","44","444",
                    "5","55","555",
                    "6","66","666",
                    "7","77","777","7777",
                    "8","88","888",
                    "9","99","999","9999"};
    

        String str="HELLO WORLD";
        //4433555555666096667775553
        System.out.print(getAns(Keys,str));
    }
}
