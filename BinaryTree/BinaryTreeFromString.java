package BinaryTree;

public class BinaryTreeFromString {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static int start=0;
    public static Node makeTree(String str){

        if(str.length()==0||str==null){
            return null;
        }
        if(start>str.length())return null;

        boolean neg=false;
        if(str.charAt(start)=='-'){
            neg=true;
            start++;
        }
        int num=0;
        while(start<str.length()&&Character.isDigit(str.charAt(start))){
            int digit=Character.getNumericValue(str.charAt(start));
            num=num*10+digit;
            start++;
        }
        if(neg)num=-num;
    

        Node node=new Node(num);

        if(start>=str.length())return node;

        if(start<str.length()&&str.charAt(start)=='('){
            start++;
            node.left=makeTree(str);
        }
        if(start<str.length()&&str.charAt(start)==')'){
            start++;
            return node;
        }

        if(start<str.length() && str.charAt(start)=='('){
            start++;
            node.right=makeTree(str);
        }
        if(start<str.length()&&str.charAt(start)==')'){
            start++;
            return node;
        }

        return node;
    }

    public static void main(String[] args) {
        String str="4(6(1)(3))(8(9))";
        Node root=makeTree(str);
        preorder(root);
    }
}
