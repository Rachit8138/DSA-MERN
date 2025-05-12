import java.util.LinkedList;

class h2 {
    
    // Node class representing a linked list node
    static class Node {
        int data;
        Node next;
    }

    // Function to push a new node to the front of the list
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    // Function to skip M nodes and delete N nodes
    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head, t;
        int count;

        // Traverse the list
        while (curr != null) {
            // Skip M nodes
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;

            // If we reach the end of the list, return
            if (curr == null)
                return;

            // Start deleting N nodes
            t = curr.next;
            for (count = 1; count <= N && t != null; count++) {
                Node temp = t;
                t = t.next;  // Delete the node
            }

            // Link the current node to the node after N deleted nodes
            curr.next = t;

            // Move the current pointer to the next node
            curr = t;
        }
    }

    // Main function to run the program
    public static void main(String args[]) {
        Node head = null;

        int M = 2, N = 3;

        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        // Print the original linked list
        System.out.printf("M = %d, N = %d\nLinked list we have is:\n", M, N);
        printList(head);

        // Skip M nodes and delete N nodes
        skipMdeleteN(head, M, N);

        // Print the updated linked list
        System.out.printf("\nLinked list after deletion is:\n");
        printList(head);
    }
}
