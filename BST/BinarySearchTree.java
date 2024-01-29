package BST;

import java.util.ArrayList;

public class BinarySearchTree {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=this.right=null;
        }
    }

    static void printInorder(Node root){
        if(root==null)return;
        printInorder(root.left);
        System.out.print(root.val+" ");
        printInorder(root.right);
    }
    static void printPreorder(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    static Node buildBST(int[]arr,int start,int end){
        if(start>end)return null;
        int mid=start+(end-start)/2;
        Node node=new Node(arr[mid]);
        node.left=buildBST(arr, start, mid-1);
        node.right=buildBST(arr, mid+1, end);
        return node;
    }

    public static Node insert(Node root,int val){
        if(root==null)return new Node(val);
        if(root.val>val){
           root.left=insert(root.left, val);
        }else if(root.val<val){
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root,int val){
        if(root==null)return false;
        if(root.val==val)return true;
        if(root.val>val){
            return search(root.left, val);
        }else {
            return search(root.right, val);
        }
    }

    static Node delete(Node root,int val){
        if(root==null)return root;
        if(root.val>val){
            root.left=delete(root.left, val);
        }
        else if(root.val<val){
            root.right=delete(root.right, val);
        }
        else{
            // case1:-
            if(root.left==null&&root.right==null)return null;

            //case2:-
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //case3:-
            Node IS=inorderSuc(root.right,val);
            root.val=IS.val;
            root.right=delete(root.right, IS.val);
        }
        return root;
    }

    public static Node inorderSuc(Node root,int val){
        if(root.left==null)return root;
        return inorderSuc(root.left, val);
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root==null)return ;
        if(root.val<k1){
            printInRange(root.right,k1, k2);
        }else if(root.val>k2){
            printInRange(root.left, k1, k2);
        }else{
             printInRange(root.left, k1, k2);
        System.out.print(root.val+",");
        printInRange(root.right, k1, k2);
        }
       
    }

    public static void printRoot2Leaf(Node root,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null&&root.right==null){
            System.out.println(list);
            list.remove(list.size()-1);
            return;
        }
        printRoot2Leaf(root.left,list);
        printRoot2Leaf(root.right,list);
        list.remove((int)list.size()-1);
    }

   public static void main(String[] args){
    // int[] arr={1,3,5,7,9,11,13,15,17,19,21};
    // Node root=buildBST(arr,0,arr.length-1);

    int[]arr={1,9,2,5,10,4,6,7,8,3};
    Node root=null;
    for(int num:arr){
        root=insert(root,num);
    }
    // printInorder(root);
    // System.out.println();

    // printPreorder(root);
    // System.out.println();

    // System.out.println(search(root, 19));

    // root=delete(root, 5);
    // printInorder(root);
    // System.out.println();

    root=insert(root,12);
    printInorder(root);
    System.out.println();
    printInRange(root,-1,20);
    System.out.println();

    printRoot2Leaf(root,new ArrayList<>());
   }   
}