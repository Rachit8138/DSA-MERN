import java.util.*;
// done
/* 
 * 
 * NOTE
 * the thing is that make from scratch until the interviewer tells you to do it 
 * else use the jcf of java
 * 
 * to build the objet
 * you can be asked to make from scratch fro arraylist and linkedlist
 * 
 */

public class a3_StackJCF {
    public static void main(String args[]) {
// this was before, easiest implementation while doing question
// Stack s = new Stack(); instead of below line // core implementation
        Stack<Integer> stack = new Stack<>();// short implementation
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); 


        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}