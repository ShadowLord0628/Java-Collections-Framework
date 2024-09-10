import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {

        // ? Vector is slower than ArrayList but it is safer and synchronized

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(20);

        System.out.println(vector);

        vector.clear();
        System.out.println("CLeared vector: " + vector);
    }
}
