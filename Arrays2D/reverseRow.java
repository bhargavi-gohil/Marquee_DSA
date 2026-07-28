public class reverseRow {
    public static void reverse(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=arr[0].length-1; j>=0; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{ 1,2,3,4 },{2,3,4,5},{6,8,10,12}};

        reverse(mat);
    }
}