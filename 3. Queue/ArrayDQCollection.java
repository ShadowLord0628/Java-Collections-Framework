import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDQCollection {
    public static void main(String[] args) {
        Deque<Integer> adq = new ArrayDeque<>();
        adq.offerFirst(10);
        adq.offer(20);
        adq.offerFirst(30);

        System.out.println("Deque = " + adq);
    }
}
