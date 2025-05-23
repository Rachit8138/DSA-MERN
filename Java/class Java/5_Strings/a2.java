import java.util.*;

public class a2 {
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
    
    public static void Anagram(String str, String str2){


    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String str=sc.nextLine();
        System.out.print("enter a word: ");
        String str2=sc.nextLine();
        sc.close();
        countVowel(str);
        Anagram(str, str2);   //frequency of each character in both the string same

    }
}