import java.util.Stack;

public class SortStackUsingRecursion {


    static void insertionSortInStack(Stack<Integer> stk,int top){

        if(stk.isEmpty() || stk.peek()<top){
            //found the right position
            stk.push(top);
            return;
        }

        //didnt found the right positon then (stk.peek()<top)
        int temp=stk.pop();
        //do recurion until you find the right place for top;
        insertionSortInStack(stk,top);

        //found the right place then add the temp value
        stk.push(temp);
    }
    static public void sortStack(Stack<Integer> stk) {
        // Your code goes here

        if(stk.isEmpty()){
            return ;
        }

        int top=stk.pop();
        //form the recurion tree for sortStack
        sortStack(stk);

        insertionSortInStack(stk,top);
    }

    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(4);
        stk.push(9);
        stk.push(6);
        stk.push(97);
        stk.push(43);
        stk.push(98);
        stk.push(2);
        stk.push(8);
        System.out.println("Before SortStack : "+stk);
        sortStack(stk);
        System.out.println("After SortStack : "+stk);


    }
}
