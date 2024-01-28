package BinaryTree;

import java.util.*;

public class PreorderBinaryTrees {
    //Class for the Node of the binary tree.................
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //----------------the info class for the diameter............
    static class info{
        int diameter;
        int height;
        info(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }


   //Class for the binary treee............. 
    static class BinaryTree{

      static int idx=-1;
      //method to build tree..............................
       Node buildtree(int[]nodes){
        idx++;
        if (nodes[idx]==-1) {
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildtree(nodes);
        newNode.right=buildtree(nodes);
        return newNode;
        }

        //preorder traversal of the tree........................
        void preorder(Node root){
            if (root==null) {
            // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        void inorder(Node root){
            if (root==null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        void postorder(Node root){
            if(root==null)return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
         
        void levelorder(Node root){
        Queue<Node>q=new LinkedList();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node node=q.remove();
                if (node==null) {
                   
                    if (q.isEmpty()) {
                        break;
                    }
                     System.out.println();
                    q.add(null);
                }
                else
               { 
                System.out.print(node.data+" ");
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                }
            }
        }

        int getheight(Node root){
                if (root==null) {
                    return 0;
                }
                return Math.max(getheight(root.left),getheight(root.right))+1;
            }

        int numofnodes(Node root){
            if (root==null) {
                return 0;
            }
            return numofnodes(root.left)+numofnodes(root.right)+1;
        }

         int sumofnodes(Node root){
            if (root==null) {
                return 0;
            }
            return sumofnodes(root.left)+sumofnodes(root.right)+root.data;
        }
        int diameter(Node root){
          if(root==null)return 0;
          return Math.max(getheight(root.left)+getheight(root.right)+1, Math.max(diameter(root.left),diameter(root.right)));
        }

        info getinfo(Node root){
            if (root==null) {
                return new info(0,0);
            }
            info linfo=getinfo(root.left);
            info rinfo=getinfo(root.right);
            int diameter=Math.max(linfo.height+rinfo.height+1,Math.max(linfo.diameter,rinfo.diameter));
            int height=Math.max(linfo.height, rinfo.height)+1;
            return new info(diameter, height);
        }

    }
   
    

    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        System.out.println(tree.diameter(root));
        System.out.println(tree.getinfo(root).height);
    }
}
