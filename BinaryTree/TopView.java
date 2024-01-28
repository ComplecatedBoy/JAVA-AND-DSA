package BinaryTree;

import java.util.*;
 class Info{
        Node node;
        int hr;
        Info(int hr,Node node){
            this.hr=hr;
            this.node=node;
        }
    }
public class TopView {



    public static void getTopView(Node root){
        HashMap<Integer,Node>map=new HashMap<>();
        Queue<Info>q=new LinkedList<>();
        q.add(new Info(0, root));

        int min=0;int max=0;
        while (!q.isEmpty()) {

           Info nodeinfo=q.remove();
           if (!map.containsKey(nodeinfo.hr)) {
                map.put(nodeinfo.hr, nodeinfo.node);
            }

           if(nodeinfo.node.left!=null){
             min=Math.min(min, nodeinfo.hr-1);
             q.add(new Info(nodeinfo.hr-1,nodeinfo.node.left));
           }

           if(nodeinfo.node.right!=null){
            max=Math.max(max, nodeinfo.hr+1);
            q.add(new Info(nodeinfo.hr+1, nodeinfo.node.right));
           }
        }

        for (int i=min; i<=max ;i++) {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
        
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
        Tree2.left.right=new Node(6);
        Tree2.left.right.right=new Node(7);
        Tree2.left.right.right.right=new Node(8);
        
        
         getTopView(Tree2);
         getTopView(Tree1);
     }
}
