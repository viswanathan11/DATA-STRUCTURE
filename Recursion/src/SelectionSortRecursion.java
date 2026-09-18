public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr=new int[]{1,23,6,9,68,2,5,70,44,3};
        SelectionSortRecursion(arr,0,0,0);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void SelectionSortRecursion(int[] arr,int i,int unsortedStart,int minIndex){

        if(unsortedStart==arr.length-1){
            return;
        }

        if(i<arr.length){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
            //find minimum in array
            //find minimum in remaining Array
            SelectionSortRecursion(arr,i+1,unsortedStart,minIndex);

        }
        else{
            //swap after inner loop finishes
            swap(arr,unsortedStart,minIndex);
            //move unsortedStart forword
            SelectionSortRecursion(arr,unsortedStart+1,unsortedStart+1,unsortedStart+1);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
