package BinaryTree;
import java.util.*;
public class KSumpaths {


    static void printKPath(Node root,int sum){
        if (root==null) {
            return;
        }
        printKPath(root.left, sum);
        printpath(root,0,sum,new ArrayList<Integer>());
        printKPath(root.right, sum);
    }

    static void printpath(Node root,int cursum,int sum,ArrayList<Integer>al){
        if (cursum==sum){
            System.out.println(al);
            return;
        }
        if(root==null) {
            return;
        }
         
        al.add(root.data);
        printpath(root.left,cursum+root.data,sum,al);
        printpath(root.right,cursum+root.data,sum,al);
        al.remove(al.size()-1);
    }
    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);
 
        int k = 5;
        printKPath(root, k);
    }
}
