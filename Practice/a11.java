package Practice;

public class a11 {

    public static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static class Stack{
        public static Node head; 

        public boolean isEmpty(){
            return (head == null);
        }

        public void push (int data){
            Node newNode = new Node(data);
            newNode.next = head; 
            head = newNode;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

        public void pop(){
            if(isEmpty()){
                return;
            }
            head= head.next; 

        }
    }
    

    public static void main(String args[]){
        Stack s= new Stack();

        s.push(34);
        s.push(33);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());

            s.pop();

        }


    }
    
}
