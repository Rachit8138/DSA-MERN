public class Solution {

    public static class Node{
        int data; 
        Node next; 
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Solution list = new Solution();

        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

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

        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        // Output the result
        if (intersectionPoint == null) {
            System.out.print("No Intersection Point\n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data + "\n");
        }
    }

    public static Node getIntersectionNode(Node head1, Node head2){
        Node curr1= head1.Linkedlistgethead
        return slow;
    }
}
