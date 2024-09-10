import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(10);
        stack.push(20);

        System.out.println("Stack = " + stack);
        stack.pop();
        System.out.println("Top of Stack = " + stack.peek());
    }
}
