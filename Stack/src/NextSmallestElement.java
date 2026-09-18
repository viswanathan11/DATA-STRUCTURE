import  java.util.*;
public class NextSmallestElement{
    public static  void main(String[] args){
        int[] arr=new int[]{1,4,6,7,3,7,8,1};

        Deque<Integer> stk=new ArrayDeque<Integer>();
        HashMap<Integer,Integer> NSE=new HashMap<>();

        int i=arr.length-1;
        while(i>=0){
            while(!stk.isEmpty() && stk.peek()>=arr[i]){
                stk.pop();
            }

            NSE.put(i,stk.isEmpty()?-1:stk.peek());
            stk.push(arr[i]);
            i--;
        }
        System.out.println(arr);
        System.out.println("The next immediate Smallest element is: ");
        for(Map.Entry<Integer,Integer> entry:NSE.entrySet()){
            System.out.println(arr[entry.getKey()] +"- > "+entry.getValue());
        }
    }
}