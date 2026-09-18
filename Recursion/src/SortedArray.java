public class SortedArray
{
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr,0));
    }
//    static int n=0;
    public static boolean isSorted(int[] arr,int n){
        if(n==arr.length-2){
            return arr[n]<arr[n+1];
        }

        return arr[n]<arr[n+1] && isSorted(arr,n+1);
    }
}
