import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static int[] sum(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            res[i] = arr1[i] + arr2[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for both arrays: ");
        int  n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements for 1st Array: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements for 2nd: ");
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("summation of same index element: ");
        String ans = Arrays.toString(sum(arr1,arr2));
        System.out.println(ans);
        sc.close();
    }
}
