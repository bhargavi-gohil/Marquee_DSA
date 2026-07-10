public class maxSubArray {
    public static int max(int[] nums) {
        int max = nums[0];  
        int currSum = nums[0];    // current subarray sum

        for (int i = 1; i < nums.length; i++) {
            // either extend the current subArray or start new from nums[i]
            currSum = Math.max(nums[i], currSum + nums[i]);
            max = Math.max(max, currSum);
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(max(arr));
    }
}
