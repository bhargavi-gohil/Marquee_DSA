package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sorting(int[] arr) {
        int n = arr.length;
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 5, 8, 6, 3, 4};
        int[] arr = {1,2,3,4,5};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
