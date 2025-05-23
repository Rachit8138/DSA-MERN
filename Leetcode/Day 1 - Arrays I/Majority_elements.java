  class Solution {

    public int majorityElement(int[] nums) {
        int majority = nums[0], lead = 1;

        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] == majority) {
                lead++;
            } else if (lead > 0) {
                lead--;
            } else {
                majority = nums[idx];
                lead = 1;
            }
        }

        return majority;
    }
}
