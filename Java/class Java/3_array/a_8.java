public class a_8 {
    public static boolean isIncreasing(int arr[], int n) {
        // if it is monotonically increasing
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {// next should be larger
                return false;
                
            }
        }

        return true;
    }

    public static boolean isDecreasing(int arr[], int n) {
        // if it is monotonically decreasing
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false; // next should be smallest
            }
        }
        return true;
    }

    public static boolean isMonotonic(int arr[], int n) {
        boolean isIncreasing = isIncreasing(arr, n);
        boolean isDecreasing = isDecreasing(arr, n);
        return isDecreasing || isIncreasing;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 2, 4 };
        int n = arr.length;
        if (isMonotonic(arr, n) == false) {
            System.out.println("non monotonic");
        } else {
            System.out.println("monotonic");
        }

    }

}
