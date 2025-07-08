// import java.util.LinkedList;

public class DoubleLL {
    public class Node{
        int data; 
        Node next; 
        Node prev; 

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head; 
    public static Node tail; 
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return; 
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void print(){
        Node temp=head; 
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){

        if(head==null){
            System.out.println(" Node is already empty");return;
            
        } else if(head.next==null){
            head=tail=null;return;
        } 
        else{
            head=head.next;
            return;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail.next=newNode;
        newNode.prev=tail; 
        tail=newNode; 

    }

    public void removeLast(){
        if(head==null){
            System.out.println(" Node is already empty");return;
        }else if(head.next==null){
            head=tail=null;return;
        }else{
        tail = tail.prev; // Move tail to the previous node
        tail.next = null; // Remove reference to the last noder
        return;
        }
    }

 
    /* public void removeLast(){
        if(head == null) {
            System.out.println("empty already ");
            return;
        }else if(head.next == null){
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    } */
 public void reverse(){
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev=next;
            prev=current;
            current=next;
        }
        head = prev;

    }
            
    public static void main(String arge[]){
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.print();

        // dll.removeFirst();
        // dll.print();
        
        // dll.addLast(0);
        // dll.print();

        dll.removeLast();
        dll.print();

        dll.reverse();
        dll.print();
      
    }
}
