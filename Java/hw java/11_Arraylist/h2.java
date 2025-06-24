import java.util.ArrayList;

public class h2 {
    /* 
     
    constraints
    Constraints :
● 2 <= nums.size() <= 1000-> O(n^2)
● 1 <= nums.get(i) <= 1000.->value cannot be more than 1000
● Assume that the answer is unique.
     */

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] count = new int[1001]; // Array for counting numbers, assuming numbers are in the range 0-1000
        
        // Building the counting array
        for (int i = 0; i < nums.size()-1; i++) {
            if (nums.get(i) == key) {
                count[nums.get(i+1)]++;
            }
        }
        
        // Finding the most frequent number
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(10);
        A.add(6);
        A.add(5);
        A.add(8);
        A.add(5);
        A.add(8);
        A.add(5);
        A.add(10);

        System.out.println(mostFrequent(A, 5)); // Should return the most frequent number that follows 5
    }
}

/* 
 
✅ Final Time Complexity: O(n)
space complexity 0(1)
​

 */