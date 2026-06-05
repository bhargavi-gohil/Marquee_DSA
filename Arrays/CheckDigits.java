public class CheckDigits{
    public static int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            int count = 0;
            int temp = num;

            // Count digits
            while (temp > 0) {
                temp /= 10;
                count++;
            }

            // Check if digit count is even
            if (count % 2 == 0) {
                    evenCount++;            
                }
        }

        return evenCount;
     }
    public static void main(String[] args) {
        int[] arr = {123,4,43,3455,4323,44};
        System.out.println("Even count of Digit is: ");
        System.out.println(findNumbers(arr));
    }
}

