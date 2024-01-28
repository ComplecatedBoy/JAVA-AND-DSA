package BinaryTree;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class CheckSubtree {

    static boolean isidentical(Node treeNode,Node subTreeNode){
        if (treeNode==null&&subTreeNode==null) 
        return true;
        else if(treeNode==null||subTreeNode==null||treeNode.data!=subTreeNode.data)
        return false;
        return isidentical(treeNode.left,subTreeNode.left)&&isidentical(treeNode.right, subTreeNode.right);
    }

    static boolean isSubtree(Node treeNode,Node subTreeNode){
        if(treeNode==null)return false;

        if (treeNode.data==subTreeNode.data) {
            if (isidentical(treeNode,subTreeNode)) {
                return true;
            }
        }

    return isSubtree(treeNode.left, subTreeNode)||isSubtree(treeNode.right, subTreeNode);
    }
     public static void main(String[] args) {
        Node Tree1=new Node(1);
        Tree1.left=new Node(2);
        Tree1.right=new Node(3);
        Tree1.left.left=new Node(4);
        Tree1.left.right=new Node(5);
        Tree1.right.left=new Node(6);
        Tree1.right.right=new Node(7);

        


        Node Tree2=new Node(2);
        Tree2.left=new Node(4);
        Tree2.right=new Node(5);

        System.out.println(isSubtree(Tree1, Tree2));
     }
}
