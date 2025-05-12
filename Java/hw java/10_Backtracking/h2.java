public class h2 {
    // Mapping of digits to letters
    final static char[][] L = {
        {}, {},          // 0 and 1 have no letters
        {'a', 'b', 'c'}, // 2
        {'d', 'e', 'f'}, // 3
        {'g', 'h', 'i'}, // 4
        {'j', 'k', 'l'}, // 5
        {'m', 'n', 'o'}, // 6
        {'p', 'q', 'r', 's'}, // 7
        {'t', 'u', 'v'}, // 8
        {'w', 'x', 'y', 'z'}  // 9
    };

    // Main function to generate letter combinations
    public static void letterCombinations(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), D);
    }

    // Helper function to perform BFS and generate combinations
    public static void bfs(int pos, int len, StringBuilder sb, String D) {      // here string builder is a java class that us used to create mutable sequence of character
        if (pos == len) {                   
            System.out.println(sb.toString());// converts sb string builder to string
        } else {
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];// . charAt helps to get the character at '2' from string
                                                                            // character.getNurmerica Valueconverts this character (which is a digit in character form like '2', '7') into an integer (2, 7).
                                                                            // L[] retrieves the corresponding elements
            for (int i = 0; i < letters.length; i++) {
                bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
            }
        }
    }

    // Main function to test the code
    public static void main(String[] args) {
        letterCombinations("27");
    }
}
