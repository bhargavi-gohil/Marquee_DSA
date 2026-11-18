public class SubArrays {
    // a continuous part of array

    public static void printing(int[] nums){
        int total = 0;
         for(int i=0; i<nums.length; i++) {
            int start = nums[i];

            for(int j=i; j<nums.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) { // printing 
                    System.out.print(nums[k]+ " ");  // subarray
                }
                total++;
                System.out.println();
            }
            System.out.println();
         }
         System.out.println("Total sub arrays: "+ total);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        printing(nums);
    }
}
