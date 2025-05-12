// Algorithm
// Create a solution matrix: Initialize it, filling it with 0’s.
// Create a recursive function: This function should take the initial matrix, the output matrix, and the position of the rat (i, j) as parameters.
// Check for validity: If the position (i, j) is out of bounds or not valid, return from the function.
// Mark the position: Set output[i][j] to 1, indicating the rat's current position.
// Check for destination: If the current position is the destination, print the output matrix and return from the function.
// Recursive calls: Recursively call the function for the positions (i+1, j) and (i, j+1) to move the rat down or to the right.
// Backtrack: If needed, unmark the position by setting output[i][j] back to 0, indicating that the rat has backtracked from that position.

public class h1 {

    // Function to print the solution matrix
    public static void printSolution(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to check if (x, y) is a valid position for the rat
    public static boolean isSafe(int[][] maze, int x, int y) {
        // Check if (x, y) is within bounds and is a valid cell (not blocked)
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    // Function to solve the maze problem
    public static boolean solveMaze(int[][] maze) {
        int N = maze.length;
        int[][] sol = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    // Recursive utility function to solve the maze problem
    public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        // If (x, y) is the bottom-right corner and is valid
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if (x, y) is valid
        if (isSafe(maze, x, y)) {
            // Check if this cell is already part of the solution path
            if (sol[x][y] == 1) {
                return false;
            }

            // Mark x, y as part of the solution path
            sol[x][y] = 1;

            // Move forward in the x direction
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            // If moving in the x direction doesn't work, move in the y direction
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }

            // Unmark x, y as part of the solution path (backtracking)
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        solveMaze(maze);
    }
}
