import java.util.*;
public class a5_reverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr= s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]) {
        String str="abc";
        String result = reverseString(str);
        System.out.println(result); 
}
