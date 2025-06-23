/* package Practice;

import java.util.ArrayList;

public class a4 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int lptr=0, rptr=list.length()-1;

        while(lptr<rptr){
            if(list.get(rptr)+list.get(lptr)==target){
                return true;
            } else if(list.get(rptr)+list.get(lptr)>target){
                rptr--;
            }else{
                lptr++;
            }

        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 17;
        System.out.println(pairSum2(list, target));
    }
}
 */

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int lptr = 0;
        int rptr = nums.length - 1;
        int []arr=new int[2];

        while (lptr < rptr) {
            int sum = nums[lptr] + nums[rptr];

            if (sum == target) {
                arr[0]=lptr;
                arr[1]=rptr;
                return arr;
            } else if (sum > target) {
                rptr--;
            } else {
                lptr++;
            }
        }
    return arr;
    }
}
