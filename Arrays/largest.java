// Largest Number in  array

public  class largest {
    public static int getLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,100};

        System.out.println("Largest no. : "+getLargest(nums));
    }
}