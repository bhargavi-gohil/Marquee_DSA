package Arrays2D;
import java.util.*;
public class printElements {
    public static void printElementsOfArray(int[][] arr,int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array for rows and cols: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter Array Elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printElementsOfArray(arr, n);
    }
}
