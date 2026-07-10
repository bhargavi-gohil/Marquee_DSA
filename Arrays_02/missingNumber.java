public class missingNumber {
     public static int missingNumber(int[] nums, int n) {
        int sum = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return sum - actual;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5};
        System.out.println("Missing number: " + missingNumber(arr, arr.length));
    }
}

// 747 -- leetcode hw