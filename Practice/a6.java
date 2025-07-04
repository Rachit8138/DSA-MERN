package Practice;

import java.util.LinkedList;

public class a6 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }

        newNode.next=head;
        head =newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void print(){
        Node temp= head; 
        while (temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        a6 ll = new a6();
        ll.addfirst(5);
        // we will now make call using LinkedList ll given above 
        ll.addlast(4);
        ll.print();

    }
}
