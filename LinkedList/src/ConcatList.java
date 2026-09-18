import java.util.Scanner;

class ListNodell{
    int data;
    ListNodell next;

    ListNodell(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    public void print(ListNodell head){
        ListNodell t=head.next;
        while(t!=null){
            System.out.println(t.data+"->");
        }
    }
}
public class ConcatList {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListNodell head1=new ListNodell(-1);
        ListNodell head2=new ListNodell(-1);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            ListNodell newNode;
            in
        }
    }
}
