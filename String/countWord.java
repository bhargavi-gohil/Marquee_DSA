package String;
import java.util.*;
public class countWord {
    public static int count(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '\t' || s.charAt(i) == ' ' || s.charAt(i) == '\n') {
                count++;
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();

        System.out.println("No. of words in String : ");

        System.out.println(count(str));

        sc.close();
    }
}
