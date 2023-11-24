package String;

public class Manacher {
    public static void menacheralgo(String s){
        int ans=0;
        int start=0;
        char[] sarr=new char[2*s.length()+1];
        sarr[0]='#';
        for (int i = 0; i < s.length(); i++) {
            sarr[2*i+1]=s.charAt(i);
            sarr[2*i+2]='#';
        }
        for (char i : sarr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int[] nop=new int[sarr.length];
        nop[0]=0;
        int l=0;
        int r=0;
        int center=0;
        int i=1;

        while (i<sarr.length) {
            if (i<r) {
                nop[i]=nop[2*center-i];
                System.out.println("reached here "+i+" "+nop[i]);
                
               
            }
            else nop[i]=0;
            int j=nop[i];
            while ((i-j)>=0&&(i+j)<sarr.length) {
                if (sarr[i+j]!=sarr[i-j]) {
                    break;
                }
                if (sarr[i+j]==sarr[i-j]) {
                   
                   nop[i]=j;

                    if (nop[i]>ans) {
                       ans=nop[i];
                       start=i-ans;
                    }
                  j++;
                }
            }
           
             if (i+nop[i]>r) {
                    center=i;
                    r=i+nop[i];
                    l=i-nop[i];
                   }

                   i++;
        }

    for (int k :nop) {
        System.out.print(k);
    }

    System.out.println();
        System.out.println(s.substring(start,start+ans));


    }
    public static void main(String[] args) {
        String s="abbaccaababb";
        menacheralgo(s);
    }
}
