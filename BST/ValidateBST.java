package BST;

public class ValidateBST {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=this.right=null;
        } 
    }

    public static boolean isValid(Node root,int min,int max){
        if(root==null)return true;
        if(root.val<min||root.val>max)return false;
        return isValid(root.left, min, root.val)&&isValid(root.right, root.val, max);
    }

    public static void main(String[] args) {
        Node root=new Node(5);

        root.left=new Node(3);
        root.left.left=new Node(2);
        root.left.right=new Node(4);

        root.right=new Node(6);
        root.right.right=new Node(10);
        root.right.right.left=new Node(9);
        root.right.right.right=new Node(11);

        System.out.println(isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
