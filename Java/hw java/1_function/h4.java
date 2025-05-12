package function;

public class h4 {
    public static void main(String[] args) {
        // Math.min()
        int minResult = Math.min(5, 8);

        // Math.max()
        int maxResult = Math.max(5, 8);

        // Math.sqrt()
        double sqrtResult = Math.sqrt(25);

        // Math.pow()
        double powResult = Math.pow(2, 3);

        // Calculate average (not directly available in Math class)
        int x = 10;
        int y = 20;
        double avgResult = (x + y) / 2.0;

        // Math.abs()
        int absResult = Math.abs(-10);

        // Display results
        System.out.println("Math.min(5, 8) = " + minResult);
        System.out.println("Math.max(5, 8) = " + maxResult);
        System.out.println("Math.sqrt(25) = " + sqrtResult);
        System.out.println("Math.pow(2, 3) = " + powResult);
        System.out.println("Average of " + x + " and " + y + " = " + avgResult);
        System.out.println("Math.abs(-10) = " + absResult);
    }
}

