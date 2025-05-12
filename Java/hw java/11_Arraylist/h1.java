import java.util.ArrayList;
import java.util.Collections;

public class h1 {

    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1)) {
                inc = false; // It's not increasing
            }
            if (A.get(i) < A.get(i + 1)) {
                dec = false; // It's not decreasing
            }
        }

        return inc || dec; // Return true if it's either increasing or decreasing

    }

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        // Sort the list
        Collections.sort(nums);
        // list to hold lonely integer
        ArrayList<Integer> list = new ArrayList<>();

        // Handle edge case where the list has only one element
        if (nums.size() == 1) {
            list.add(nums.get(0));
            return list;
        }

/* Note
hered we have done first and last separately because if you check it continously then both will be added
ie[1, 10, 4,6] in this manner
 * 
 */
        // Check the first element
        if (nums.size() > 1 && nums.get(0) + 1 < nums.get(1)) {
            list.add(nums.get(0));
        }

        // Check the elements between the first and last
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }

        // Check the last element
        if (nums.size() > 1 && nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            list.add(nums.get(nums.size() - 1));
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(10);
        A.add(6);
        A.add(5);
        A.add(8);
        A.add(5);

        ArrayList<Integer> nums = A;
        System.out.println(isMonotonic(A));

        System.out.println(findLonely(nums));

    }
}   