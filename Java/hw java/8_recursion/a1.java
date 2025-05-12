public class a1 {
    public static void all_occ(int arr[], int key, int i) { // i is index TC is n
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        all_occ(arr, key, i + 1);
    }

    static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    // Recursive function to print digits of a number in words
    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }
        
        // Get the last digit
        int lastDigit = number % 10;
        
        // Recursively call the function with the number divided by 10
        printDigits(number / 10);
        
        // Print the string representation of the last digit
        System.out.print(digits[lastDigit] + " ");
    }
    
    public static int length(String str) {
        // Base case: if the string is empty, return 0
        if (str.length() == 0) {
            return 0;
        }
        
        // Recursive call: get the length of the substring and add 1
        return length(str.substring(1)) + 1;
    }

    public static int countSubstrs(String str, int i, int j, int n) {
        // Base case: A single character substring is always a palindrome
        if (n == 1) {
            return 1;
        }
        
        // Base case: If the substring length is less than or equal to 0, return 0
        if (n <= 0) {
            return 0;
        }

        // Recursively count palindromic substrings
        int res = countSubstrs(str, i + 1, j, n - 1) 
                + countSubstrs(str, i, j - 1, n - 1) 
                - countSubstrs(str, i + 1, j - 1, n - 2);

        // If the characters at the start and end of the current substring are the same,
        // increment the result count
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Transfer top n-1 disks from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        
        // Transfer nth disk from src to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        
        // Transfer n-1 disks from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
        
    }
    
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        all_occ(arr, 2, 0);
        System.out.println();

        printDigits(1234);
        System.out.println();  // Print a newline after the digits
    

        String str="abcde";
        System.out.println(length(str));

        int n = str.length();
        // Print the number of palindromic substrings in the string
        System.out.print(countSubstrs("abcab", 0, n - 1, n));

        towerOfHanoi(4, "A", "B", "C");
    }

}

