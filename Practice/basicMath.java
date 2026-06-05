package Practice;
public class basicMath {
    // public static int countDigit(int n) {
    //     int count = 0;
    //     while(n > 0){
    //         int digit = n%10;
    //         n /= 10;
    //         count++;
    //     }
    //     return count;
    // }

    // Reverse 
    // public static int reverse(int n){
    //     int rev = 0;
    //     while(n > 0){
    //         int rem = n%10;
    //         n /= 10;
    //         rev = rem + rev*10;
    //     }
    //     return rev;
    // }

    // palindrome 
    // public static void pali(int n){
    //     int rev = 0;
    //     int temp = n;
    //     while(temp > 0){
    //         int rem = temp%10;
    //         temp /= 10;
    //         rev = rem + rev*10;
    //     }
    //     if(n == rev){
    //         System.out.println("Palindrome");
    //     }else{
    //         System.out.println("Not");
    //     }
    // }

    // GCD of two numbers
    // public static int gcd(int n1, int n2){
    //     n1 = Math.abs(n1);
    //     n2 = Math.abs(n2);
    //     if (n1 == 0) return n2;
    //     if (n2 == 0) return n1;
    //     while (n2 != 0) {
    //         int temp = n2;
    //         n2 = n1 % n2;
    //         n1 = temp;
    //     }
    //     return n1;
    // }
    // Divisors of a Number
    // public static int[] divisors(int n){
    //     int[] res = new int[n];
    //     int count = 0;
    //     for(int i = 1; i <= n; i++){
    //         if(n%i == 0){
    //             res[count] = i;
    //             count++;
    //         }
    //     }
    //     return Arrays.copyOf(res, count);
    // }

    
    public static void main(String[] args) {
        // System.out.println(countDigit(334));
        // System.out.println(reverse(3559));
        // pali(121);
        // System.out.println("GCD: " + gcd(9,12));
        // System.out.println("Divisors: " + Arrays.toString(divisors(8)));
    }
}
