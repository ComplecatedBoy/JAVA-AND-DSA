package BinaryTree;


public class TreefromString {
    static int index=0;
    public static Node getTree(String str,Node root){
        if (str.charAt(index)==')') {
            return null;
        }
        root=new Node(str.charAt(index));
        index++;
        if (index<str.length()&&str.charAt(index)=='(') {
            index++;
           return root.left=getTree(str, root.left);
        }
        index++;
        if (index<str.length()&&str.charAt(index)=='(') {
            index++;
           return root.right= getTree(str, root.right);
        }
      return root;
    }
    public static void main(String[] args) {
        String str="4(2(3)(1))(6(5))";
        Node root=null;
        root=getTree(str,root);
        System.out.println((char)root.left.right.data);
    }
}
