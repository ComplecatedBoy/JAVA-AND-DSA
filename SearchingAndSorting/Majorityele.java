package SearchingSorting;

public class Majorityele {
    public static void main(String[] args) {
        int [] arr= { 2,2,4,1,2,3,2,2,3,4,1,2,3,4,2,2,2,2,2,1,2,2,3,4,3,4,2};
        int count=0;
        int ele=arr[0];
        for(int i =0;i<arr.length;i++){
           if(count==0){
            ele=arr[i];
            count++;
           }else if (arr[i]==ele){
            count++;
           }else{
            count--;
           }
        }

        count=0;

        for (int  element : arr) {
            if(ele==element)count++;
            else count--;
        }

        if(count>0)System.out.println("The majority element is "+ele);
        else System.out.println("There is no majority element");
    
    }
}
