package Practice;

import java.util.Stack;


public class a3 {
    public static String reverse(String s){
        // 1. store all the string in stack
        Stack <Character> stack = new Stack<>();
        for (int i =0; i<s.length();i++){
            stack.push(s.charAt(i));
        }
        
        // 2. store everything in stringbuilder 
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        // 3. return string
        return result.toString();

    }
    public static void main(String[] args) {
        System.out.println(reverse("rachit"));
    }
    
}
