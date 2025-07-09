import java.util.*;

public class a5_reverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        for (char ch : str.toCharArray()) {
            s.push(ch);
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));  // Output: cba
    }
}
