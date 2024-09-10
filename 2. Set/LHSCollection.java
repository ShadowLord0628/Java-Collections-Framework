import java.util.LinkedHashSet;

public class LHSCollection {
    public static void main(String[] args) {
        LinkedHashSet<Integer> llSet = new LinkedHashSet<>();

        llSet.add(5);
        llSet.add(5);
        llSet.add(2);
        llSet.add(20);

        System.out.println(llSet);

    }
}
