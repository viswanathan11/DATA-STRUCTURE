
class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class SinglyLinkedList {

    Node head;

    SinglyLinkedList(){
    }

    public static Node insertHead(Node head,int val){
        Node dummy=new Node(-1);
        Node newNode=new Node(val);
        dummy.next=head;

        newNode.next=dummy.next;
        dummy.next=newNode;

        return dummy.next;

    }

    public static Node deleteNode(Node head,int val){
        Node dummy=new Node(-1);
        dummy.next=head;
        Node t=dummy.next;
        Node tp=dummy;
        while (t!=null && t.val!=val){
            tp=t;
            t=t.next;
        }

        if(t!=null){

        tp.next=t.next;
        t.next=null;
        }
        return dummy.next;
    }

    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertHead(head,5);
        head=insertHead(head,6);
        head=insertHead(head,7);
        head=insertHead(head,8);
        head=insertHead(head,9);
        head=insertHead(head,10);
        head=deleteNode(head,100);
        printList(head);

    }
}
