import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class PreviousSmallestElement {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,6,7,3,7,8,1};
        Deque<Integer> stk=new ArrayDeque<Integer>();
        HashMap<Integer,Integer> PSE=new HashMap<>();
        int i=0;
        while(i<arr.length){
            while(!stk.isEmpty() && stk.peek()>=arr[i]){
                stk.pop();
            }
            PSE.put(i,stk.isEmpty()?-1:stk.peek());
            stk.push(arr[i]);
            i++;
        }

        for(int x:arr) System.out.print(x+", ");
        System.out.println();
        System.out.println("The Preivious immediate Smallest element is: ");
        for(Map.Entry<Integer,Integer> entry:PSE.entrySet()){
            System.out.println(arr[entry.getKey()] +"- > "+entry.getValue());
        }
    }
}
