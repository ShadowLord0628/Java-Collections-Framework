import java.util.Queue;
import java.util.LinkedList;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5); // ! add can throw exception
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.add(40);

        System.out.println("Queue = " + queue);
        System.out.println("Front of Queue = " + queue.peek());
        System.out.println("Q remove = " + queue.remove()); // ! it can throw exception
        System.out.println("Queue = " + queue);
        System.out.println("Q Poll = " + queue.poll());
        System.out.println("Queue = " + queue);
    }
}
