//  optimize code -- space complexity -> O(1)
public class reverseArray {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left < right) {
            // swapping
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,62,3};

        reverse(nums);
        System.out.println("Reverse array : ");
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
