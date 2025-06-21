public class h3 {
    // Define the size of the chessboard
    static int N =8;

    // Function to print the solution matrix
    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) 
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }  

    // Utility function to solve the Knight's Tour problem using backtracking
    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
        int k, next_x, next_y;

        // Base case: If all squares are visited, return true
        if (movei == N * N)
            return true;

        // Try all next moves from the current coordinate
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                // Recursively try to solve the rest of the board
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y] = -1; // Backtracking
            }
        }

        return false;
    }

    // Function to check if (x, y) is a valid move for the Knight
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    // Main method to run the program
    public static void main(String args[]) {
       int sol[][] = new int[8][8];

        // Initialize the solution matrix with -1
        for (int x = 0; x < N; x++){
            for (int y = 0; y < N; y++){
                sol[x][y] = -1;
            }
        }           

        // xMove[] and yMove[] define next move of Knight
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        // The Knight starts from the first cell (0, 0)
        sol[0][0] = 0;

        // Start the recursive utility function to solve the problem
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
        } else {
            printSolution(sol);
        }
        }

    }

