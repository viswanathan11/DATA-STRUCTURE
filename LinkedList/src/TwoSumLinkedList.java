import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class TwoSumLinkedList{

    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here
        List<List<Integer>> result=new ArrayList<>();

        HashSet<Integer> hsp=new HashSet<>();

        ListNode t=head;

        while(t!=null){
            int tmp=target-t.val;

            if(hsp.contains(tmp)){
                result.add(List.of(t.val,tmp));
            }
            
            hsp.add(t.val);
            

            t=t.next;
        }

        return result;
    }

   public static void main(String[] args) {
        TwoSumLinkedList solver = new TwoSumLinkedList();
        
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int target = 5;
        // Note: The function name has a typo 'ArrayListL' which will cause a compilation error.
        // Assuming it should be 'ArrayList'.
        List<List<Integer>> pairs = solver.findPairsWithGivenSum(head, target);
        
        System.out.println("Pairs with sum " + target + ": " + pairs);
   } 
}