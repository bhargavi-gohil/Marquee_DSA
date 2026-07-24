import java.util.ArrayList;
public class reverseList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(34);
        arr.add(45);
        arr.add(100);
        System.out.println("Before reverse: "+arr);
        int i = 0, j = arr.size() - 1;
        while(i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println("After reverse: "+arr);
    }
}