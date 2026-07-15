import java.util.Scanner;

public class functionalRecursion {
    public static void reverse(int i,int[] arr, int n) {
        if(i >= n/2) return;

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(i+1,arr,n);
    }

    // check string is palindrome or not...
    public static boolean palindrome(int i,String s) {
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        return palindrome(i+1,s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter Array Elements");

        // for(int i=0; i<n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("Here is reversed array:..");
        // reverse(0, arr, n);
        // for(int i=0; i<n; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        String s = sc.next();
        if(palindrome(0,s)) {
            System.out.println("Yes, it is a palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }
        sc.close();
    }
}