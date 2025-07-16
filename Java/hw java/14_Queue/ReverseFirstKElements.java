import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElements {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        int k = 5;

        System.out.println("Original Queue: " + queue);
        reverseQueueFirstKElementsUsingRecursion(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + queue);
    }

    static void reverseQueueFirstKElementsUsingRecursion(Queue<Integer> queue, int k) {
        // Step 1 and 2: Reverse first K elements using recursion
        helper(queue, k);

        // Step 3: Push remaining elements to back to maintain order
        int sz = queue.size() - k;
        while (sz-- > 0) {
            int x = queue.poll();
            queue.add(x);
        }
    }

    static void helper(Queue<Integer> queue, int k) {
        if (k == 0) return;

        int e = queue.poll();
        helper(queue, k - 1);
        queue.add(e);
    }
}
