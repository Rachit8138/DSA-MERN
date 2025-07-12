package Practice;

import java.util.Stack;

public class a2 {

    public static void pab(Stack<Integer> s, int data){
        // base case 
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //recursive case 
        int top = s.pop();
        pab(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        // base case 
        if(s.isEmpty()){
            return;
        }
        // recursive case
        int top =s.pop();
        reverse(s);
        pab(s, top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pab(s, 4);
        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }   
}
