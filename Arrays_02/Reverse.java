    import java.util.*;
// https://www.geeksforgeeks.org/problems/reverse-an-array/1
public class Reverse {
    public static void reverseArray(int arr[]) {
        // code here
            int left = 0;
            int right = arr.length-1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,7,8,9};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
