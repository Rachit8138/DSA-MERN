
public class sudoku {
    public static void main(String args[]){
        int sudoku[][] =  
       {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0}, 
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0}, 
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4}, 
        {0, 4, 9, 0, 3, 0, 0, 5, 7}, 
        {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        //System.out.println(sudokuSolver(sudoku, 0, 0) ? "Solution exists" : "Solution doesn't exists");  // using ternary operator
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution doesn't exist");
        }
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col){// the function to knoow 
        
        //base case
        if(row == 9 && col == 0){
            return true;  // successfully filled the entire grid.
        }
        //  else if(row == 9){
        //     return false;
        // }
        // recursion
        int nextRow = row; int nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1; digit<=9; digit++){
          if(isSafe(sudoku, row, col, digit)){
            sudoku[row][col] = digit;
            if(sudokuSolver(sudoku, nextRow, nextCol)){  // solution exists
                return true;
            }
            sudoku[row][col] = 0;  // backtrack if no solution is found
            }
        }
    return false;
}

public static boolean isSafe(int sudoku[][], int row, int col, int digit){
    // column condition
        for(int i=0; i<=8; i++){
          if(sudoku[i][col] == digit){
            return false;
          }
        }
        // row condition
        for(int j=0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        // grid condition
        int sr = (row/3) * 3; // sr = starting row
        int sc = (col/3) * 3; // sc = starting col
        for(int i=sr; i<sr+3; i++){
          for(int j=sc; j<sc+3; j++){
              if(sudoku[i][j] == digit){
                  return false;
                }
            }
        }
        return true;
    }
    
    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println(); // printing next line after every line
        }
    }
}
