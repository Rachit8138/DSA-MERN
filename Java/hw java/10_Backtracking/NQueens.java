public class NQueens {

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);  
    }
    public static void nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }
        //recursive case
        for (int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'x';// if the Q cannot be placed in the row this statement will be carried out and the value of j will eventually increase
            }
        }
        
    }

    public static boolean isSafe(char board[][], int row, int col){
        //up 
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left side up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right side up
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }


    public static void printBoard(char board[][]) {
        System.out.println();
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        } 
    }


}
