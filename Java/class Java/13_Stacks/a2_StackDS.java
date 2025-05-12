import java.util.*;
// done
//stack using Linked List
public class a2_StackDS {//stack class 
    static class Node {// represetn ll with node
        int data;
        Node next;

        Node(int data) {// constructor where data is passed and initialised
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
         static Node head = null;//initialised 
         public static boolean isEmpty() {// to check if empty
            return head == null;
        }
        // push
         static void push(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;  
            head = newNode;
        }
        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }
        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}