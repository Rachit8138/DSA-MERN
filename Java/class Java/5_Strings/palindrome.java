//Problem : Palindrome
public class palindrome {

    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "noon"; // racecar, noon
        System.out.println(isPalindrome(str));
    }
}

/* 

goes up to the middle element
if the word is even splits into half 
if the word is odd  the middle portion won't be checked and no need to 

 */