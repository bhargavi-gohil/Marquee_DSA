public class basicQuestions {
    public static void printName(String name, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printName(name, n - 1);
    }

    public static void linearlyPrint(int n) {

        if(n == 0){
            return;
        }
        System.out.println(n);
        linearlyPrint(n-1);

    }
    
    public static void linearlyPrint2(int n) {
        if(n == 0) {
            return;
        }
        linearlyPrint2(n-1);
        System.out.println(n);
    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
    
    
    public static void main(String[] args) {
        // String name = "Bhargavi";
        // print name N times
        // printName(name, 5);

        // print num linearly from n to 1
        // linearlyPrint(10);

        // print num linearly from 1 to n
        // linearlyPrint2(5);

        // factorial of n
        int fact = fact(5);
        System.out.println(fact);
    }
}