import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElementss {

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;

        // Call recursive method
        reverseQueueFirstKElementsUsingRecursion(queue, k);

        // Print the queue after reversing first k elements
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }

    static void reverseQueueFirstKElementsUsingRecursion(Queue<Integer> queue, int k) {
        helper(queue, k);
        int sz = queue.size() - k;
        while (sz-- > 0) {
            int x = queue.poll();
            queue.add(x);
        }
    }

    // Helper function for recursion
    static void helper(Queue<Integer> queue, int k) {
        if (k == 0)
            return;

        int x = queue.poll();
        helper(queue, k - 1);
        queue.add(x);
    }

    // Optional: Stack-based version (not called in main, but shown in your images)
    static void reverseQueueFirstKElementsUsingStack(Queue<Integer> queue, int k) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        // Push first k elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }

        // Enqueue stack contents back to queue
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }

        // Move remaining elements to the back to preserve order
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }
}
