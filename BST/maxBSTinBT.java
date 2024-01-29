package BST;

public class maxBSTinBT {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=this.right=null;
        } 
    }

    static class info {
        boolean isBST;
        int size;
        int max;
        int min;
        info(Boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.max=max;
            this.min=min;
        } 
    }

    static int maxBST=0;

    public static info solve(Node root){
        if(root==null)return new info(true, 0,Integer.MAX_VALUE,Integer.MIN_VALUE);

        info left=solve(root.left);
        info right=solve(root.right);

        int size=left.size+right.size+1;
        int min=Math.min(root.val,Math.min(left.min,right.min));
        int max=Math.max(root.val,Math.max(left.max, right.max));

        if( root.val<=left.max || root.val>=right.min ){
            return new info(false, size,min,max);
        }

        if(left.isBST&&right.isBST){
            maxBST=Math.max(maxBST, size);
            return new info(true, size, min, max);
        }
        return new info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        solve(root);
        System.out.println(maxBST);
    }
}
