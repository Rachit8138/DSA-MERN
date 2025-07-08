package Practice;

import java.util.LinkedList;

public class Linked {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static Node head; 
    public static Node tail; 
    public static int size; 

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

    public int removefirst(){
        if(head == null){
            System.out.println("empty");
            return -1;
        }
        int val= head.data;
        head = head.next;
        size--;
        System.out.println(tail.data);
        return val;
    }

    public  int removelast(){
        if(head == null){
            System.out.println("empty");
            return -1;
        }else if (size ==1){
            size--;
            int val=head.data;
            head = tail = null;
            return val;
        }

        Node temp= head;
        for(int i =0; i<size -2;i++){
            temp= temp.next;
        }
        int val=temp.next.data;
        temp.next = null;
        tail=temp;
        size--;
        return val;
    }

    public int itrsearch(int key){
        Node temp = head; 
        for(int i =0; i<size;i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;

        }
        return -1;

    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head; 
        Node next; 
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        head = prev;
    }

    public void removenthend(int idx){

        // size
        Node temp = head; 
        int size =0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(idx == size){
            head = head.next;
            return;
        }

        int i=0;
        Node prev= head;
        while(i<size-idx-1){
            i++;
            prev= prev.next;
        }
        prev.next = prev.next.next;
    }


    public static void main(String args[]){
        Linked ll= new Linked();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addlast(6);
        
        ll.print();
        ll.addlast(1);
        ll.addlast(2);
        ll.print(); 
        ll.remocycle();
        tail.next = new Linked(3);

    }

   
public void remocycle() {
    if (head == null || head.next == null) return;

    // Step 1: Detect cycle
    Node slow = head;
    Node fast = head;
    boolean c = false;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            c = true;
            break;
        }
    }

    // 🛑 Return if no cycle is found
    if (!c) {
        System.out.println("no cycle");
        return;
    }

    // Step 2: Find the start of the loop
    Node prev = null;
    slow = head;
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Step 3: Remove cycle
    prev.next = null;
}

    // finding the mid 
    public static Node findmid(){
        Node slow = head; 
        Node fast = head; 
        while(fast!= null && fast.next !=null){
            slow=slow.next; 
            fast = fast.next; 
        }
        return slow;
    }
    




    public static boolean checkpalindrome(){
        // edge case 
        if(head== null || head.next == null){
            return true;
        }
        // reverse the 2nd half
        Node prev = null;
        Node curr = findmid();
        Node next;
        while(curr!= null){
            next = curr.next; 
            curr.next = prev;
            prev= curr; 
            curr = next;
        }
        // 1st half head; 
        Node left = head; 
        // 2nd half head; 
        Node right = prev;
        while(right != null){
            if(right.data !=left.data) return false;
            left=left.next; 
            right = right.next;
        }
        return true;
    }
}
