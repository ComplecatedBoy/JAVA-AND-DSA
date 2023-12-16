package BackTrackingProblems;

 class FindPermutations {
     static int count=0;
      public static void printpermutation(String str, String newStr){
        if (str.length()<=0) {
            count++;
            System.out.println(newStr);
            return;
        }
            
        for (int i = 0; i < str.length(); i++) {
             printpermutation(str.substring(0, i)+str.substring(i+1), newStr+str.charAt(i));
        }
      }
    public static void main(String[] args) {
        String str="abcdfr";
        printpermutation(str," ");
        System.out.print(count);
    }
}
