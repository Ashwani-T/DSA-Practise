package DSA_GATE.Assignment1;
import java.util.Stack;
public class question17 {
    public static void deleteMiddle(Stack<Integer> stack, int current, int size) {
        if (stack.isEmpty() || current == size / 2) {
            stack.pop();
            return;
        }

        int top = stack.pop();
        deleteMiddle(stack, current + 1, size);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        
        int size = stack.size();
        deleteMiddle(stack, 0, size);

        System.out.println(stack);
    }
}
