public class NQueens {
    // IF SOLUTION EXISTS OR NOT
    public static boolean checkNQueens(char board[][], int row) {
        if(row == board.length) {
            return true;
        }
        //cols
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(checkNQueens(board, row+1)) {
                    return true;
                }
                board[row][j] = 'x';
            } 
        }
        return false;
    }

    //refers to the number of rows in 
    // the 2D array board. because 2d array is basically array of array 
    // which counts every array as a separate number
    public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        //nQueens(board, 0);
        System.out.println("Total number of ways = "+ countWays);
        //--------------------------------------
        if(checkNQueens(board, 0)) {
            System.out.println("solution exists");
            printBoard(board);
        } else {
            System.out.println("no solution exists");
        }
    }

    // below line is to check the number of possible solutions
    static int countWays = 0;
    public static void nQueens(char board[][], int row ) {
        if(row == board.length) {
            printBoard(board);
            countWays++;        // this is where it should make all the difference where you count or print 
            return;
        }
        //cols
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'x';
            } 
        }
    }
    
    // checks the upper diagonals and vertical column
    // the sign >= gives it's possible range 

    public static boolean isSafe(char board[][], int row, int col) {
        //up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //up left diag
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //up right diag
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // to print the solution board
    public static void printBoard(char board[][]) {
        System.out.println("---- safe board ----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
