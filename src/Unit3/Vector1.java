package Unit3;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vt = new Vector<>(4,5);
        vt.add("First");
        vt.add("Second");
        vt.add("Third");
        vt.add("Fourth");
        vt.add("Fifth");
        vt.add(2,"Fourth");
        System.out.println(vt.capacity());
        System.out.println(vt.size());
        System.out.println(vt.get(2));
        System.out.println(vt.remove(0));
        System.out.println(vt);
    }
}
