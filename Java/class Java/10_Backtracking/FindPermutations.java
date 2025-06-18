public class FindPermutations {
    //TC. O(n*n!)
    public static void findPermutation(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char pickedChar = str.charAt(i);
            String restStr = str.substring(0,i) + str.substring(i+1);// abcde =ab+de upto i+1 to end 
            findPermutation(restStr, ans+pickedChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutation(str, "");
    }
}
