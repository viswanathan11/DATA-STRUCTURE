import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr=new int[]{4,4,7,8,4,9};
        System.out.println(isTarget(arr,0,1));
        List<Integer> lt=new ArrayList<Integer>();
//        System.out.println(findTarget(arr,0,4,lt));
        System.out.println(findTarget2(arr,0,4));
        System.out.println(lt);
    }

    //    static int n=0;
// object is same but every function call has different reference variables

    public static List<Integer> findTarget(int[] arr, int i, int target, List<Integer> lt){
        if(i==arr.length){
            return lt ;
        }
        if(arr[i]==target){
            lt.add(i);
        }

        return findTarget(arr,i+1,target,lt);
    }

    public static List<Integer> findTarget2(int[] arr, int i, int target ){
        //answer form the current call
        List<Integer> lt=new ArrayList<>();
        if(i==arr.length){
            return lt ;
        }
        if(arr[i]==target){
            lt.add(i);
        }
        //contains answeer from the below calls
        List<Integer> answerFromBellowCalls=findTarget2(arr,i+1,target);
        lt.addAll(answerFromBellowCalls);
        //The return statement return the lt object of that function to the previos call's lta
        // We are returning the list lt of each function with answer to the below function
        return lt;
    }
    public static boolean isTarget(int[] arr,int n,int target){
        if(n==arr.length-1){
            return arr[n]==target;
        }

        return arr[n]==target || isTarget(arr,n+1,target);
    }
}
