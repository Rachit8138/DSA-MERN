import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    static void printSlidingWindowMaximumDeque(int arr[], int N, int K) {
        Deque<Integer> queue = new LinkedList<>();

        // (or first window) 
        for (int i = 0; i < K; ++i) {
            // For every element, the previous smaller elements are useless so
            // remove them from Qi
            while (!queue.isEmpty()
                    && arr[i] >= arr[queue.peekLast()])
                // Remove from rear
                queue.removeLast();
            // Add new element at rear of queue
            queue.addLast(i);
        }

        // Print first window maximum
        System.out.print(arr[queue.peek()] + " ");

        //  rest of the elements, i.e., from arr[K] to arr[n-1]
        for (int i = K; i < N; ++i) {
            // Remove the elements which are out of this window
            while ((!queue.isEmpty()) && queue.peek() <= i - K)
                queue.removeFirst();

            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while ((!queue.isEmpty()) && arr[i] >= arr[queue.peekLast()])
                queue.removeLast();

            // Add current element at the rear of queue
            queue.addLast(i);

            // Print the maximum element of last window
            System.out.print(arr[queue.peek()] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int K = 3;
        int N = arr.length;
        printSlidingWindowMaximumDeque(arr, N, K);
    }
}
