package BinaryTree;

public class SumTree {
    public static int transform(Node root){
         if(root==null)
         return 0;
         int left=root.left==null?0:root.left.data;
         int right=root.right==null?0:root.right.data;

         int leftchild=transform(root.left);
         int righchild=transform(root.right);

         root.data=left+right+leftchild+righchild;

        return root.data;
    }
        
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);  

        transform(root);
        System.out.println(root.right.data);
    }
}
