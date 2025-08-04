public class a3Queue_array {
/* asked */
    static class Queue {// static class so it could be used in the main class
        static int arr[];
        static int size;
        static int rear;

        // constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty function7
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add function
        public static void add(int data) {
            // if the arr is full
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            // adding the element
            rear = rear + 1;
            arr[rear] = data;
            /* 
             * | Code       | Increment Before / After      | First element inserted at           | Expected `rear` start |
| ---------- | ----------------------------- | ----------------------------------- | --------------------- |
| **Code 1** | `rear = rear + 1;` (Before)   | `arr[0]` (if `rear = -1` initially) | `rear = -1`           |
| **Code 2** | `arr[rear++] = data;` (After) | `arr[0]` (if `rear = 0` initially)  | `rear = 0`            |

             */
            
        }

        // remove function
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

        public static void main(String args[]) {
            Queue q = new Queue(3);

            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
