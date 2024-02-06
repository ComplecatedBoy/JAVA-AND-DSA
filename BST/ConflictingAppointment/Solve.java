package BinarySearchTrees.ConflictingAppointment;

class Interval{
    int low;
    int high;
    public Interval(int low,int high){
        this.low=low;
        this.high=high;
    }
}

class ITNode{
    Interval i;
    int max;
    ITNode left,right;
    public ITNode(Interval i){
        this.i=i;
        this.max=i.high;
        left=right=null;
    }
}

public class Solve{

    public static ITNode Insert(ITNode root,Interval i){
        if (root==null) {
            return new ITNode(i); 
        }
        if(i.low<root.i.low)root.left=Insert(root.left, i);
        else root.right=Insert(root.right, i);

        if(root.max<i.high){
            root.max=i.high;
        }
        return root;
    }



    public static boolean Overlap(Interval a,Interval b){
        if(a==null)return false;
        if(a.low<b.high && a.high>b.low)return true;
        return false;
    }


    public static Interval overlapSearch(ITNode root,Interval i){
        if(root==null)return null;
        if(Overlap(root.i,i))return root.i;

        if(root.left!=null&&root.left.max >=i.low)return overlapSearch(root.left,i);
        return overlapSearch(root.right, i);
    }

    public static void printConfilicting(Interval[]appt,int n){
        ITNode root=null;
        root=Insert(root,appt[0]);
        
        for(int i=1;i<n;i++){
            Interval res=overlapSearch(root,appt[i]);

            if(res!=null){
                System.out.print("{"+appt[i].low+","+appt[i].high+"}");
                System.out.print(" conficts with the Interval ");
                System.out.println("{"+res.low+","+res.high+"}");
            }
            root=Insert(root, appt[i]);
        }
    }
    public static void main(String[]args){
        Interval appt[]=new Interval[6];
        appt[0]=new Interval(1, 5);
        appt[1]=new Interval(3,7);
        appt[2]=new Interval(2, 6);
        appt[3]=new Interval(10,15);
        appt[4]=new Interval(5,6);
        appt[5]=new Interval(4,10);
        int n=appt.length;

        System.out.println("Following are the Conflicting Intervals....");
        printConfilicting(appt,6);
    }
}
