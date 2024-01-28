package BinaryTree;

public class CreateMirrorTree {

    static PreorderBinaryTrees.Node createMirror(PreorderBinaryTrees.Node root){
            if (root==null) {
                return root;
            }
        PreorderBinaryTrees.Node node =new PreorderBinaryTrees.Node(root.data);
        node.left=createMirror(root.right);
        node.right=createMirror(root.left);
         return node;
    }
    public static void main(String[] args) {
        PreorderBinaryTrees.Node root=new PreorderBinaryTrees.Node(5);
        root.left=new PreorderBinaryTrees.Node(3);
        root.right=new PreorderBinaryTrees.Node(6);
        root.left.left=new PreorderBinaryTrees.Node(2);
        root.left.right=new PreorderBinaryTrees.Node(4);

        PreorderBinaryTrees.Node MirrorNode=createMirror(root);
        PreorderBinaryTrees.BinaryTree tree=new PreorderBinaryTrees.BinaryTree();
        tree.inorder(MirrorNode);
        System.out.println();
        tree.inorder(root);
    }
}
