package BinaryTree;

public class MirrorTree {
    static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node mirror(Node root){
        if(root==null)return null;
        Node mirror=new Node(root.data);
        mirror.left=mirror(root.right);
        mirror.right=mirror(root.left);
        return mirror;
    }



     public static void main(String[] args) {
        Node root=new Node(3);

        root.left=new Node(2);
        root.right=new Node(5);

        root.left.left=new Node (6);
        root.left.right=new Node(8);

        root.right.right=new Node(9);

        Node mirror=mirror(root);
        
        inorder(root);
        System.out.println();
        inorder(mirror);

     }
}