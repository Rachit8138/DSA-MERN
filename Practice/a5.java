public class a5 {
    class Solution {
        public boolean isMonotonic(int[] nums) {
            boolean inc = true;
            boolean dec = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1])
                    inc = false;
                if (nums[i] > nums[i + 1])
                    dec = true;

            }
            return inc || dec;
        }
    }
}
