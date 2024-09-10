import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(16);
        set.add(5);
        set.add(4);

        System.out.println(set.contains(10));
        System.out.println(set);
    }
}
