public class BubbleSort {
    public static void main(String[] args) {

        int[] arr=new int[]{1,23,6,9,68,2,5,70,44,3};
        bubbleSortRecursion(arr,0,arr.length-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSortRecursion(int[] arr, int i,int len){
        if(len-1==0){
            return;
        }

        if(i<len){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
            //i+1 is the position of our swaped elemenet
            bubbleSortRecursion(arr,i+1,len);
        }
        //now the un sorted part is reduced
        bubbleSortRecursion(arr,0,len-1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
