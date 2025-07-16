package Practice;

import java.util.LinkedList;

public class a7 {

    public static class Node{
        int data;
        Node next; 
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }


    public static class Queue{
        public static Node head; 
        public static Node tail;
        // add last 

        public static boolean isEmpty(){
            return head == null;
        }
        public static void add(int data){

            // creating new node 
            Node newNode= new Node(data);
            if( head== null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int peek(){
            if (head == null){
                return -1;
            }
            return head.data;


        }

        public static int remove(){
            if(head == null){
                return -1;

            }
            int top = head.data;
            head = head.next; 
            
            return top;
        }
    }

    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    
}
