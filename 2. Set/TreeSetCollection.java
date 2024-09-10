import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(20);
        tset.add(5);
        tset.add(10);
        tset.add(12);
        tset.add(6);
        tset.add(6);

        System.out.println(tset);
    }
}
