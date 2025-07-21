  import java.util.*;

  /*  important*/
public class a2Queue_LL {

    public static class Node{
        int data;
        Node next;
        
        //construsctor 
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        private static Node head;
        private static Node tail;

        //cheaking is the queue is empty or not
        public static boolean isEmpty(){
            return head == null;
        }

        //add
        public  void add(int data){
            Node newNode = new  Node(data);

                //if the list is empty
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public  int remove(){
            
            //if empty
            if(isEmpty()){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            //if single element in our queue
            if(tail == head){
                head = tail = null;
                return val;
            }
            head = head.next;
            return val;

        }

        //peek
        public  int peek(){
            //if queue empty
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            
            return head.data;
        }

        public static void main(String args[]){
            Queue q = new  Queue();

            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.peek());
            while(!isEmpty()){
                System.out.println(q.remove());
            }
        }


    }
    
}
