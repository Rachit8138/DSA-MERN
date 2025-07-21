import java.util.*;
public class a6Queue_using_two_stack {
/* asked in ms and google  */
    static class Queue{
        
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        //empty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add  - O(n)
        public static void add(int data){
            //transfering elements from s1 to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //adding new element 
            s1.push(data);

            //transfering the elements back
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }


        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String args[]){

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }
    
}
