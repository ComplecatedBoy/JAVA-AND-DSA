package LinkedList;

public class TraversalByArbit {

    static class Node {
        int data;
        Node next,arbit;
        Node(int data){
            this.data=data;
            next=arbit=null;
        }
    }

    static void printList(Node node,Node anode){
        System.out.println("The Link List is ++++++++++++++++++++");
        System.out.println("--------------Traversal by the next------------");
        System.out.println();
        while (node!=null) {
            System.out.print(node.data+"->");
            node=node.next;
        }
        System.out.println();

        System.out.println("--------------Traversal by the arbit------------");
        System.out.println();
        while (anode!=null){
            System.out.print(anode.data+"->");
            anode=anode.arbit;
        }
        System.out.println();
    }

static Node getmerged(Node left,Node right){
  Node newNode=new Node(-1);
  Node temp=newNode;
  while (left!=null&&right!=null) {
     if (left.data<=right.data) {
        temp.arbit=left;
        left=left.arbit;
        temp=temp.arbit;
     }else{
        temp.arbit=right;
        right=right.arbit;
        temp=temp.arbit;
     }
  }
  while (left!=null) {
    temp.arbit=left;
        left=left.arbit;
        temp=temp.arbit;
  }
while(right!=null)
{temp.arbit=right;
        right=right.arbit;
        temp=temp.arbit;

}

return newNode.arbit;   
}

Node getMidnodeths(Node head){
    Node slow=head;
    Node fast=head.arbit;
    while (fast!=null&&fast.arbit!=null) {
        slow=slow.arbit;
        fast=fast.arbit.arbit;
    }
    return slow;
}

Node mergesortbyarbit(Node head){

     if(head==null||head.arbit==null)return head;
     Node midNode=getMidnodeths(head);
     Node lefthead=head;
     Node righthead=midNode.arbit;
     midNode.arbit=null;

    Node left=mergesortbyarbit(lefthead);
    Node right=mergesortbyarbit(righthead);

    
  return getmerged(left,right);
  }



    static Node getArbitHead(Node head){

        Node ahead=head;
        Node temp=head.next;
        while (temp!=null) {
            ahead=getmerged(ahead,temp);
            temp=temp.next;
        }
        
        return ahead;

        //   Node temp=head;
        //   while (temp!=null) {
        //     temp.arbit=temp.next;
        //     temp=temp.next;
        //   }
        //    return mergesortbyarbit(head);
    }
      public static void main(String[] args) {

            Node head=new Node(5);
            head.next=new Node(10);
            head.next.next= new Node(2);
            head.next.next.next=new Node(3);
            head.next.next.next.next=new Node(15);
            head.next.next.next.next.next=new Node(7);

            Node ahead=getArbitHead(head);
            printList(head, ahead);
        }


}
