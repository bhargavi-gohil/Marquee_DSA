public class binarySearch {
    public static  int search(int[] arr, int key) {
        int l = 0, r= arr.length-1;
        while(l <= r) {
            int mid = l + (r-l)/2;

            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,9,10};

        int key = 8;
        System.out.println("Index of key : "+ search(nums, key));
    }
}
