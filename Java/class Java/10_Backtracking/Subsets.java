public class Subsets {

    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        findSubsets(str, ans + str.charAt(i), i + 1); // yes
        findSubsets(str, ans, i + 1); // no
        
    }

    public static void main(String[] args) {
        findSubsets("abc", "", 0);
    }
}
