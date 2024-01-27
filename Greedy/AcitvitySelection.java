package Greedy;
import java.util.*;

public class AcitvitySelection {
    public static void main(String[] args) {
        int start[]={5,1,3,0,8,5};
        int end[]={7,2,4,5,9,9};

        int activities[][]=new int[start.length][3];

        for(int i=0;i<end.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        Arrays.sort(activities,new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[2]-b[2];
            }
        });

        // for(int[]arr:activities){
        //     System.out.println("Activity:"+arr[0]+" start "+arr[1]+ " end "+arr[2]);
        // }

        ArrayList<Integer>al=new ArrayList<>();
        int count=0;
        int last=0;

        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=last){
                count++;
                al.add(activities[i][0]);
                last=activities[i][2];
            }
        }
        Collections.sort(al);
        System.out.println(count);
        System.out.println(al);
    }
}