package BST;

public class ConvertBSTtoBalanced {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
  }

  static class BST{
       Node root =null;

      Node createBST(int[]arr,int si,int ei){
        if (si>ei) {
            return null;
        }
           int mid=si+(ei-si)/2;
           Node node=new Node(arr[mid]);
           node.left=createBST(arr, si, mid-1);
           node.right=createBST(arr, mid+1, ei);
           return node;
      }
       
  }
  public static void preorder(Node root){
    if (root==null) {
        return;
    }
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
  }

  public static void main(String[] args) {
    
  }
}
