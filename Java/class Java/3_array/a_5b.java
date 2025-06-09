//max_subarray_sum_kadanes_algorithm
public class a_5b {
    public static void kadanes( int nums []){
        int currSum = 0;
        int maxSum  = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(currSum , maxSum);
            if (currSum < 0){
                currSum = 0;
            }
            
            // System.out.println(maxSum);
        }
        System.out.println("Max sum is : " + maxSum);
    }

    public static void main(String args[]) {
        int nums[] = {-1,-2,-3};
        kadanes(nums);
    }  
}