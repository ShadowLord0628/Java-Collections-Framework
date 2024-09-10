import java.util.PriorityQueue;

public class PQCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // ! In java min-heap is used for priority queue
        pq.offer(12);
        pq.add(3);
        pq.offer(4);
        pq.add(5);

        System.out.println("Priority Queue = " + pq);
        System.out.println("Peek = " + pq.peek());
        System.out.println("Poll = " + pq.poll());
        System.out.println("Priority Queue = " + pq);
        System.out.println("Peek = " + pq.peek());
        System.out.println("Remove = " + pq.remove());
        System.out.println("Priority Queue = " + pq);
    }
}
