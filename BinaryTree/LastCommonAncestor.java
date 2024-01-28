package BinaryTree;

import java.util.*;

public class LastCommonAncestor {


    public static boolean getpath(Node root,int n,ArrayList<Node>path){
        if (root==null) {
            return false;
        }
        path.add(root);
        if (root.data==n) {
            return true;
        }
        if (getpath(root.left, n, path)||getpath(root.right, n, path)) {
            return true;
        }
        path.remove(root);
        return false;
    }
    public static Node getlca(Node root,int n1,int n2){
         ArrayList<Node>path1=new ArrayList<>();
         ArrayList<Node>path2=new ArrayList<>();

         getpath(root,n1,path1);
         getpath(root,n2,path2);
         int i=0;
         for (; i < path1.size()&&i<path2.size(); i++) {
            if (path1.get(i)!=path2.get(i)) {
                break;
            }
         }
          return path1.get(i-1);
    }

   static Node lca(Node root,int n1,int n2){
      if (root==null) {
        return null;
      }
      if (root.data==n1||root.data==n2) {
        return root;
      }
      Node leftlca=lca(root.left, n1, n2);
      Node rightlca=lca(root.right, n1, n2);
      if (leftlca==null) {
        return rightlca;
      }
      if (rightlca==null) {
        return leftlca;
      }
      return root;
      }

        public static int getdist(Node root,int n){
          if (root==null) {
            return -1;
          }
          if (root.data==n) {
            return 0;
          }
         int leftdis=getdist(root.left, n);
         int rightdis= getdist(root.right, n);
         if (leftdis==-1&&rightdis==-1) {
          return -1;
         }else if(leftdis==-1)return rightdis+1;
         else return leftdis+1;
        }

      static int Mindistance(Node root,int n1,int n2){
          Node lca=lca(root, n1, n2);
          int leftdist=getdist(lca,n1);
          int rightdist=getdist(lca,n2);
          return leftdist+rightdist;
      }
     
      static int kthAncestor(Node root,int n,int k,Node ans){
        if (root==null) {
          return -1;
        }
        if (root.data==n) {
          return 0;
        }
        int leftdis=kthAncestor(root.left, n, k,ans);
        int rightdis=kthAncestor(root.right, n, k,ans);
        if(leftdis==-1&&rightdis==-1)return -1;
        int dist= Math.max(leftdis, rightdis);
        if (dist+1==k) {
        ans.data=root.data;
        }
        return dist+1;
      }
      

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);  
        
         System.out.println(getlca(root,7,4).data);
         System.out.println(Mindistance(root,7,4));
         Node node=new Node(Integer.MIN_VALUE);
         kthAncestor(root, 5, 1,node);
         System.out.println(node.data);

    }
}
