public class a_2 {
    public static void getlargest(int numbers[]) { // Change 'void' to 'int'
    int s=numbers[0];
    int g=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] > g) {
                g = numbers[i]; // Update s
            }
            if (numbers[i] < s) {
                s = numbers[i]; // Update s
            }
        }
        System.out.println("s:" + s);
        System.out.println("l:" + g); // Should now work without error
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5};
        getlargest(numbers);
    }
}
