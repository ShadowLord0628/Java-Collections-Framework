import java.util.TreeMap;

public class TreeMapCollection {
    public static void main(String[] args) {
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Second", 22);
        tmap.put("First", 30);
        tmap.put("Third", 10);
        tmap.put("Eleventh", 45);

        System.out.println("Tree Map = " + tmap);
    }
}
