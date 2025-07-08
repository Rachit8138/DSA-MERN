package Java.hw java.12_LinkedList;

public class Linked {

    public static class Node{
        int data;
        Node next; 
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }

    public static Node head; 
    public static Node tail;
    // Creates a cycle by connecting tail.next to the node at position 'pos' (0-based)
public void createCycle(int pos) {
    if (pos < 0 || head == null) return;

    Node temp = head;
    Node cycleNode = null;
    int index = 0;

    // Find the node at position pos
    while (temp != null) {
        if (index == pos) {
            cycleNode = temp;
            break;
        }
        temp = temp.next;
        index++;
    }

    if (cycleNode == null) return; // position out of range

    // Link tail to cycleNode to form a cycle
    tail.next = cycleNode;
}

 public void addfirst(int data){
        // creaate a node;
        Node newNode= new Node(data);
        size++;

        if(head==null){
            head = tail = newNode; 
            return; 

        }
        newNode.next= head;
        head = newNode;
    }

    public void addlast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head = tail = newNode; 
            return; 

        }
        tail.next = newNode; 
        tail = newNode;
    }

    public void print(){
        Node temp = head; 
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
    Linked ll = new Linked();
    ll.addfirst(2);
    ll.addfirst(3);
    ll.addlast(6);
    ll.addlast(1);
    ll.addlast(2);

    ll.print();  // prints normal list

    // Create a cycle at position 2 (0-based)
    ll.createCycle(2);

    // Now, calling print() will cause infinite loop if cycle not removed
    // So remove cycle first
    // ll.remocycle();

    ll.print();  // prints list after cycle removed
}

    
}
