package Practice;

public class a5 {
    public static class Node {
        //This class will be used to represent individual elements (or "nodes") of the linked list. 
        // It's marked static, meaning it belongs to the outer class (LinkedList) and doesn't need an 
        // instance of the outer class to be created.
        int data;
        Node next;  //node type. holds a reference to the next Node

        public Node(int data) {//onstructor of the Node class. obj made from this will be entire linked list
            this.data = data;// iBAsically initializest assigns the value to the node’s data field   
            this.next = null; //Initializes the next pointer to null, meaning the node doesn't point to any other node yet.
        }
    }
    public static Node head;//points to the first nodeSince it’s static, this variable is shared among all instances of the LinkedList class
    public static Node tail;//points to the last node
    public static int size;//  tracks the number of nodes

    public void addFirst(int data) {
        //step1 = create new node 
        Node newNode = new Node(data);
        size++;
        //step2 - newNode next = head
        newNode.next = head; //link-

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {// you need void not static
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public void print() { // O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]) {
        a5 ll = new a5();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        
        ll.print();
ll.checkPalindrome();
ll.print();
        

    }
    public Node findMid(Node head) { //helper
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next;//+2
        }
        return slow; //slow is my midNode
    }

    public void checkPalindrome() {
        // for null and one value 
        if(head == null || head.next == null) {
            return;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
    
}
