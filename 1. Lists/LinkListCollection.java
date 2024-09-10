import java.util.LinkedList;

public class LinkListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(0, 10);
        linkedList.add(20);
        linkedList.add(1, 15);

        System.out.println(linkedList);

        linkedList.remove(1);

        System.out.println("After Removing element at 1st index:\n" + linkedList);
    }
}
