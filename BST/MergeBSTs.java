package BST;

import java.util.ArrayList;

public class MergeBSTs {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=this.right=null;
        } 
    }
   

    public static Node merge(Node root1,Node root2){
        ArrayList<Node>tree1=new ArrayList<>();
        ArrayList<Node>tree2=new ArrayList<>();
        inorder(root1,tree1);
        inorder(root2,tree2);
        ArrayList<Node>merged=merge(tree1,tree2);
        return BuildBST(merged,0,merged.size()-1);
    }

    public static void inorder(Node root,ArrayList<Node>arr){
        if(root==null)return;
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
    }

    public static ArrayList<Node> merge(ArrayList<Node>list1,ArrayList<Node>list2){
        ArrayList<Node>merged=new ArrayList<>();
        int i=0;int j=0;
        while( i<list1.size() && j<list2.size()){
            if(list1.get(i).val<list2.get(j).val){
                merged.add(list1.get(i));
                i++;
            }else{
                merged.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            merged.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            merged.add(list2.get(j));
            j++;
        }
        return merged;
    }

    public static Node BuildBST(ArrayList<Node>list,int start,int end){
        if(start>end)return null;
        int mid=start+(end-start)/2;
        Node node=list.get(mid);
        node.left=BuildBST(list,start,mid-1);
        node.right=BuildBST(list, mid+1, end);
        return node;
    }

    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        Node merged=merge(root1,root2);
        System.out.println(merged.right.left.val);
        print(merged);
    }

    public static void print(Node root){
        if(root==null)return;
        print(root.left);
        System.out.print(root.val+" |");
        print(root.right);
    }
}
