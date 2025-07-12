public class LinkedList {
    public static class Node {
        //This class will be used to represent individual elements (or "nodes") of the linked list. 
        // It's marked static, meaning it belongs to the outer class (LinkedList) and doesn't need an 
        // instance of the outer class to be created.
        int data;
        Node next;  //node type. holds a reference to the next Node

        public Node(int data) {//onstructor of the Node class. obj made from this will be entire linked list
            this.data = data;// iBAsically initializest assigns the value to the node’s data field   
            this.next = null; //Initializes the next pointer to null, meaning the node doesn't point to any other node yet.
        }
    }
    public static Node head;//points to the first nodeSince it’s static, this variable is shared among all instances of the LinkedList class
    public static Node tail;//points to the last node
    public static int size;//  tracks the number of nodes

    public void addFirst(int data) {
        //step1 = create new node 
        Node newNode = new Node(data);
        size++;
        //step2 - newNode next = head
        newNode.next = head; //link-

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {// you need void not static
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { // O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //to add the middle
    public void add(int idx, int data) {
        // for the first index
        if(idx == 0) {
            addFirst(data);
            return;
        }
        // create a node
        Node newNode = new Node(data);
        size++;
        Node prev = head;
        int i = 0;
        // go upto idx-1 so that you have prev and next
        while(i < idx-1) {
            prev = prev.next;
            i++;
        }

        //i = idx-1; prev -> prev
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {// if linked list is empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } 
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    /* public int itrSearch(int key) { //O(n)
        Node temp = head;
        int i = 0;  

        while(temp != null) {
            if(temp.data == key) { //key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }
        //recursion search 
    public int helper(Node head, int key) { // O(n)
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }
   
    public int recSearch(int key) {
        return helper(head, key);
    } */

    public void reverse() {//O(n)
        Node prev = null;
        Node curr = tail = head;
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

    // very important qn asked in many companies

    public void deleteNthfromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz) {
            head = head.next; //removeFirst
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Slow-Fast Approach node is its return type so no need for static 
    // very important question asked in amazon flipkart
    public Node findMid(Node head) { //helper
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next;//+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome() {
        // for null and one value 
        if(head == null || head.next == null) {
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;//right half head
        Node left = head;

        //step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    
    public static boolean isCycle() { 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //cycle exists
            }
        }

        return false; //cycle doesn't exist
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            System.out.println("cycle doesn't exist");
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }

     private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        //Linked list part 1
       
        /*  LinkedList ll = new LinkedList();
        // we will now make call using LinkedList ll given above 
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);

        ll.print();
        //ll.addLast(1);

        // 1->2->3->4->5
        // ll.print(); // Print the linked list
        // System.out.println(ll.checkPalindrome());
        // ll.reverse();   
        // ll.print(); */  
    
        /* // LinkedList Part 2
        // Detecting loop in cycyle also known as Floyd cycle Finding calgorithm
        head= new Node(1); 
        head.next= new Node(2); 
        head.next.next = new Node(3);
        head.next.next.next = head;


        System.out.println(isCycle());// detect if cycle exist
        removeCycle(); */

        // remove a loop/cycle 
        
        head= new Node(1); 
        Node temp=new Node(2);
        head.next= temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        

        removeCycle();  //remove the loop and adds it to null
        ll.print();
    }
}