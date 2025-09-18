package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(7);
        list.add(34);
        list.add(-12);
        Collections.sort(list);
//        System.out.println(list);
        System.out.println(list.toString().replace("[", "")
                .replace("]", ""));
        Collections.reverse(list);
        System.out.println(list);
    }
}
