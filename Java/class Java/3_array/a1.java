class Solution {
    public int[] productExceptSelf(int[] nums) {
        int aux[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    sum = sum * nums[j];
                }
            }
            aux[i] = sum;
        }
        return aux; // Fix: return the array
    }
}
