class h2 {

    // Function to find the majority element in an array
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            // Count occurrences of the current element
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count += 1;
                }
            }

            // Return the element if it is the majority
            if (count > majorityCount) {
                return nums[i];
            }
        }

        return -1;
    }

    // Main method to test the majorityElement function
    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // Output: 2
    }
}
