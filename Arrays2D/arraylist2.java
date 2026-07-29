import java.util.*;
public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }

        list.get(3).add(15);
        list.get(1).add(15);
        list.get(2).add(20);
        list.get(4).add(1444);
        list.get(0).add(200);
        System.out.println(list);
    }
}
