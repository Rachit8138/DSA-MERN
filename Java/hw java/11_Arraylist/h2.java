import java.util.ArrayList;

public class h2 {

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
