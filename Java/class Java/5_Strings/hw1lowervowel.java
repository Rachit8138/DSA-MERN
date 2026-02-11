import java.util.Arrays;
import java.util.Scanner;

public class hw1lowervowel {
    public static void countVowel(String str){
        int count=0;
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean Anagram(String str1,String str2){
        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check: if the lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings into char arrays
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
/* 
What happens:

"listen" → ['l','i','s','t','e','n']

"silent" → ['s','i','l','e','n','t']

Why needed:

Strings cannot be sorted

Arrays can be sorted

*/
            // Sort the char arrays
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            // Compare the sorted char arrays
             return Arrays.equals(str1CharArray, str2CharArray);//this checks: Same length Same characters Same order
        } else return false;
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a word: ");
        String str2=sc.nextLine();
        

        String s1="ea";
        String s2="eat";

        // countVowel(str2);
        sc.close();
        System.out.println(Anagram(s1, s2));;   //frequency of each character in both the string same

    }
}