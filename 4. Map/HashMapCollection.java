import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        hmp.put(1, 20);
        hmp.put(2, 30);
        hmp.put(3, 22);

        System.out.println("Hash Map = " + hmp);
        System.out.println("Remove = " + hmp.remove(3));
    }
}
