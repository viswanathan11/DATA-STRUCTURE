


class DoublyLinkedList {
static class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }

}
    Node head;
    Node tail;
    DoublyLinkedList(){
        head=new Node(-1);
        tail=new Node(-1);

        head.next=tail;
        tail.prev=head;
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        head.next.prev=newNode;
        newNode.next=head.next;
        newNode.prev=head;
        head.next=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        newNode.next=tail;
        newNode.prev=tail.prev;
        tail.prev.next=newNode;
        tail.prev=newNode;
    }

    public  void removeData(int data){
        Node t=head.next;
        while (t!=tail && t.data!=data){
            t=t.next;
        }

        if(t!=tail){
            t.prev.next=t.next;
            t.next.prev=t.prev;

            t.prev=null;
            t.next=null;
        }
    }

    public void printDll(){
        Node t=head.next;
        while(t!=tail){
            System.out.print(t.data + "->");
            t=t.next;
        }
    }
}

public class DLL{

    public static void main(String[] args){
        DoublyLinkedList dll=new DoublyLinkedList();

        dll.addFirst(10);
        dll.addFirst(90);
        dll.addFirst(89);
        dll.addLast(100);
        dll.addLast(993);
        dll.printDll();
    }
}


