public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int target=5;

        System.out.println(binarySearch(arr,0,arr.length-1,target));
    }

    static int binarySearch(int[] arr,int s,int e,int target){
        int mid=s+(e-s)/2;
        if(s>e){
            return -1;
        }

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return binarySearch(arr,mid+1,e,target);
        }

        return binarySearch(arr,s,mid-1,target);
    }
}
