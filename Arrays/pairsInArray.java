public class pairsInArray {
      public static void pairs(int[] arr) {
        int tp = 0;
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+curr + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Number of pairs : "+tp);
      }
      public static void main(String[] args) {
        int nums[] = {2,3,4,5,6,7,8};
        pairs(nums);

      }
}
