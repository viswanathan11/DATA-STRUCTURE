public class BuildingHeap {
    static int size=0;
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
        public static void buildMinHeap(int[] arr){
            size=arr.length;
            for(int i=size/2-1;i>=0;i--){
                heapifyDown(arr,i,size);
            }
        }
    public static void heapifyDown(int[] arr,int idx,int size){

        int i=idx;
        
        while(true){
            int left_child=2*i+1;
            int right_child=2*i+2;
            int smallest=i;

            if(left_child<size && arr[left_child]<=arr[smallest]){
                smallest=left_child;
            }

            if(right_child<size && arr[right_child]<=arr[smallest]){
                smallest=right_child;
            }

            if(i==smallest) break;
            swap(arr, i, smallest);

            i = smallest;
        }
    }

    public static void heapifUp(int[] arr,int idx){
        int i=idx;

        //i>0 because root does not have any parent;
        while(i>0){
            int parent=(i-1)/2;

            if(arr[parent]<=arr[i]) break;
            swap(arr, i, parent);
            i=parent;
        }
    }

    public static int getMin(int[] arr){
        if(size==0) return -1;
        int min=arr[0];
        arr[0]=arr[size-1];
        size--;
        heapifyDown(arr, 0,size);
        return min;
    }
    public static void print(int[] arr){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1={7, 2, 9, 1, 5, 3};
        int[] arr2={7, 2, 9, 1, 5, 3};

        print(arr1);
        buildMinHeap(arr1);
        print(arr1);
    }
}
