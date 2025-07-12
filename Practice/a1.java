package Practice;

import java.util.Stack;

public class a1 {
    public static class Node{
        int data; 
        Node next ;
        public Node(int data){
            this.data= data; 
            this.next = null;
        }
    }

    public static Node head; 


    public static class tack{

        public  void push(int data){
            // 1. create a new node; 
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head; 
            head = newNode;
        }


        public void print(){
            Node temp = head; 
            while(temp!= null){
                System.out.print(temp.data+"->");
                temp= temp.next;  
            }
            System.out.println("null");
        }
        
        public boolean isEmpty(){
            return head == null;

        }

        public int pop(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int top = head.data;
            head =head.next; 
            return top;
        }
        public int peek(){
            
        }

    }
    public static void main(String[] args) {
        tack s = new tack();
        s.push(3);
        s.push(5);
        s.push(56);
        s.print();
        while(!s.isEmpty()){
            System.out.println();
        }
        
    }
}
