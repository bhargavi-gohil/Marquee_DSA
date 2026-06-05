
// import java.util.*;
public class Two_sum{
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        
        for(int i = 0; i < n; i++){
            for(int j=i+1; j<n; j++){
                if((nums[i] + nums[j]) == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[arr.length];

        // for(int i = 0)
        int[] arr = {3,3};
        System.out.println(twoSum(arr,6));
    }
}