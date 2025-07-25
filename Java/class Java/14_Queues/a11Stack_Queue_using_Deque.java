import java.util.*;
/* not important for creating stacks and queue */
public class a11Stack_Queue_using_Deque {
    static class Stack {// static class to be used in main class 
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addFirst(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }
        
        public int peek() {
            return deque.getFirst();
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
