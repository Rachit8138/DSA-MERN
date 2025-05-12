class h3 {

    // Function to count inversions in an array
    public static int getInvCount(int arr[]) {
        int n = arr.length;
        int invCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        
        return invCount;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = " + getInvCount(arr));
    }
}
