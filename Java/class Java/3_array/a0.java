public class a0 {

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trapWater(height));
    }

    public static int trapWater(int height[]) {
        int n = height.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0] = height[0];
        rightmax[n - 1] = height[n - 1];

        // for left max
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        // for right max
        for (int j = n - 2; j >=0; j--) {
            rightmax[j] = Math.max(rightmax[j + 1], height[j]);
        }

        int water = 0;
        for (int k = 0; k < n; k++) {
            water += Math.min(leftmax[k], rightmax[k]) - height[k];
        }
        return water;

    }

}
