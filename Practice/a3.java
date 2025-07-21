package Practice;

import java.util.Stack;

public class a3 {
    static class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());

            }
            // if empty then push 
            s1.push(data);
            // transferring elements back 
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }



    }

    public static void main(String[] args){
        Queue q= new Queue();
        q.add(1);
        q.add(3);
        q.add(4); 
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
    
}
