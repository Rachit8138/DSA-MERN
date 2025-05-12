class s1 {

    // Node class representing a linked list node
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node head; 
    public static Node tail;

    // Function to get the intersection point of two linked lists
    public Node getIntersectionNode(Node head1, Node head2) {
        // Traverse list2 and compare each node with list1
        while (head2 != null) {
            Node temp = head1;

            // Check if head2 is present in head1
            while (temp != null) {
                if (temp == head2) {
                    return head2; // Intersection point found
                }
                temp = temp.next;
            }

            head2 = head2.next; // Move to the next node in list2
        }
        return null; // No intersection point found
    }

    public void printr(Node head) { // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        s1 list = new s1();
        // Creating two linked lists with intersection
        Node head1 = new Node(10); // First list: 10 -> 15 -> 30
        Node head2 = new Node(3); // Second list: 3 -> 6 -> 9 -> 15 -> 30

        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        
        //printing the array that i have. 
         
        list.printr(head1);
        
        list.printr(head2);

Node common=commonpoint(head1, head2);
        // Finding intersection point
        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.print("No Intersection Point\n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }
    }
}

public static void commonpoint(Node head1,Node head2){
    // make it cirular linkedlist for head 2 node so that head1 and head 2 forms a 
    Node temp=head2;
    tail.next=head2;

    Node slow=head1; 
    Node fast=head2;
    boolean cycle=false; 
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast=slow){
            cycle=true; break;
        }
    }
    if(cycle==false){
        System.out.println("cycle doesn't exist");
        return;
    }

    slow= head; 
    Node prev=null;
    while(slow!=fast){
        prev=fast; 
        slow=slow.next;
        fast=fast.next.next;
    }



    return;
}