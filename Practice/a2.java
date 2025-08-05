package Practice;

import java.util.Stack;

public class a2 {
    public static void pushAtBottom(Stack<Integer> s, int data){
        //base case 
        if(s.isEmpty()){
            s.push(data); 
            return; 
        }
        // recursive case 
        int temp= s.pop();
        pushAtBottom(s, data);
        s.push(temp); 
    }

    public static void reverse(Stack<Integer> s){
        //base case 
        if(s.isEmpty()){
            return; 
        }
        // recursive case 
        int temp= s.pop();
        reverse(s);
        s.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 
        s.push(1); 
        s.push(2);  
        s.push(3); 

        pushAtBottom(s, 4);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
