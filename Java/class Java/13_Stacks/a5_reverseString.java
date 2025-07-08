import java.util.*;
public class a5_reverseString {
    public static String reverseString(String str){
        // 1. Store all the String in the stack s 
        Stack<Character> s = new Stack<>();
        int idx =0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        // 2. StringBuilder to store the resultant product
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr= s.pop();
            result.append(curr);
        }

        // 3. return the string 
        return result.toString();
    }
    public static void main(String args[]) {
        String str="abc";
        System.out.println(reverseString(str)); 
}
}
