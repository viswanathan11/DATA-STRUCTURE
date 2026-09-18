import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreatesElement {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,6,7,3,7,8,1};
        Deque<Integer> stk=new ArrayDeque<Integer>();
        HashMap<Integer,Integer> NGE=new HashMap<>();
        int i=arr.length-1;
        while (i>=0) {
            while(!stk.isEmpty() && stk.peek() <=arr[i]){
                stk.pop();
            }
            NGE.put(i,stk.isEmpty()?-1:stk.peek());
            stk.push(arr[i]);
            i--;
        }

        for(int x:arr) System.out.print(x+", ");
        System.out.println();
        System.out.println("The Next immediate Greates element is: ");
        for(Map.Entry<Integer,Integer> entry:NGE.entrySet()){
            System.out.println(arr[entry.getKey()] +"- > "+entry.getValue());
        }
    }
}
