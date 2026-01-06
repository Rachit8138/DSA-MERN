//max_subarray_sum_kadanes_algorithm

// kadanes algorithm is based on finding currentsum and maximum at that index
public class a_5b {
   

    public static void kadanes(int[] nums) {
    int currSum = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
        currSum = Math.max(nums[i], currSum + nums[i]);
        maxSum = Math.max(maxSum, currSum);
    }
    System.out.println("Max sum is : " + maxSum);
}

    public static void main(String args[]) {
        int nums[] = {-1,-2,-3};
        kadanes(nums);
    }  
}







