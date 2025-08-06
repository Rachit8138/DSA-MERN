package Practice;

import java.util.Stack;

public class a6 {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>(); 
        for(int i = 0; i<str.length();i++){

            // current character 
            char c= str.charAt(i); 

            // opening brackets
            if(c=='(' || c=='{' || c=='[')s.push(c);
            // closing brackets
            if(s.isEmpty())return false;
            if(c==')' && s.peek()=='('|| c=='}' && s.peek()=='{' || c==']'&& s.peek()=='[')s.pop();

            

        }
        if(s.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args){
        System.out.println(isValid("[2=3({}){]"));
        
    }
    
}
