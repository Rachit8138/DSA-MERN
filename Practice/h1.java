package Practice;

import java.util.LinkedList;

public class h1 {

    public static class Node{
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
        Node newnode = new Node(data);
        size++;
        if(head== null){
            head= tail=newnode;// if you decide tail then automatically tail points towards null; 
            return;
        }
        newnode.next=head;
        head = newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head== null){
            head= tail=newnode;
            return;
        }
        tail.next= newnode;
        tail= newnode;        
    }

    public void print(){
        Node temp= head; 
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public void add(int idx, int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newNode= new Node(data);
        Node prev= head;
        int i =0;
        while(i<idx-1){
            i++;
            prev= prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
    }

    public int removefirst(){
        if(head == null ){
            System.out.println("empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head= tail= null;
            size--;
            return val;
        }
        int val= head.data;
        head= head.next;size--;
        return val;
    }
    public int removelast(){
        if(head==null){
            System.out.println("null");
            return -1;
        }else if(size==1){
            int val=head.data;
            head= tail=null;
            size--;
            return val;
        }

        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
            i++;
        }
        int val=prev.data;
        prev.next=null;
        size--;
        return val;
    }

    public void remove(int idx) {
    if (idx < 0 || idx >= size+1) {
        System.out.println(size+1);
        System.out.println("Not possible");
        return;
    }

    if (idx == 0) {
        removefirst();
        return;
    }

    Node prev = head;
    for (int i = 0; i < idx - 1; i++) {
        prev = prev.next;
    }
    System.out.println(tail.data);
          

    prev.next = prev.next.next;
    size--;
}

 public void reverse() {//O(n)
        Node prev = null;
        Node curr = head;
        Node next;
// parroting 
        while(curr != null) {
            next = curr.next;// this is the declaring part of the program this will identify which is next
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        h1 ll= new h1();
        ll.addfirst(3);
        ll.addlast(4);
        ll.addfirst(0);
        ll.add(1,5);
        
        ll.print();
        System.out.println(ll.removefirst());// gives you the integer 
        ll.print();
        ll.addlast(3);

        ll.print();
        ll.remove(3);
        ll.print();
        ll.addfirst(34);

        ll.reverse();
        ll.print();



    }
}
