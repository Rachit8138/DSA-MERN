public class ReverseWords {

    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sum = new StringBuilder();
        int end = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (i + 1 < end) {
                    sum.append(s.substring(i + 1, end)).append(" ");
                }
                end = i;
            }
        }

        // Add first word
        sum.append(s.substring(0, end));

        return sum.toString();
    }

    public static void main(String[] args) {
        String s = "  a good      example";
        System.out.println(reverseWords(s));
    }
}
