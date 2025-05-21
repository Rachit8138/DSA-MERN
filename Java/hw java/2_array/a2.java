public class a2 {
    public static void repeat(int nums[]) {
        int aux[] = new int[5];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;  // Fix: Reset sum for each i
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    sum = sum * nums[j];
                }
            }
            aux[i] = sum;
        }

        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 1};
        repeat(n);
    }
}
