package BST;

public class MirrorBST {

    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=this.right=null;
        } 
    }

    static Node mirror(Node root){
        if(root==null)return null;
        Node node=new Node(root.val);
        node.left=mirror(root.right);
        node.right=mirror(root.left);
        return node;
    }

    public static void inorder(Node node){
        if(node==null)return;
        inorder(node.left);
        System.out.print(node.val+" | ");
        inorder(node.right);
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

        Node mirror=mirror(root);
        inorder(root);
        System.out.println();
        inorder(mirror);
    }
}
