public class bit {
    public static String xor(String n1, String n2) {
        int n = Math.max(n1.length(), n2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c1 = i < n1.length() ? n1.charAt(n1.length() - 1 - i) : '0';
            char c2 = i < n2.length() ? n2.charAt(n2.length() - 1 - i) : '0';
            sb.append(c1 == c2 ? '0' : '1');
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println("Enter two num that are contains only 0 and 1");
        String n1 = "0b1010100";

        String n2 = "0b100101";
        
        String res = xor(n1,n2);
        System.out.println("Output: ");
        System.out.println(res);
    }
}