package BinaryTree;

public class KthLevel {

    static void printKthlevel(Node node,int currlevel,int level){
        if (node==null) {
            return;
        }
        if (currlevel==level) {
            System.out.print(node.data +" ");
            return ;
        }
        printKthlevel(node.left, currlevel+1, level);
        printKthlevel(node.right, currlevel+1, level);

    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int k=3;
        printKthlevel(root,1,k);
    }
}
