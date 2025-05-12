
public class nQueensWOAttack {
    public static void main(String args[]){
        int n = 2;
        // taking char 2D array
        char chessBoard[][] = new char[n][n];

        // putting x/blanks inside the chessBoard
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chessBoard[i][j] = 'x';
            }
        }
        nQueens(chessBoard, 0);
    }

    static void nQueens(char board[][], int i){
        // base case
        if(i == board.length){
           printBoard(board);
           return;
        }

        // logic - putting Qs inside the array
        for(int j=0; j<board.length; j++){  
            board[i][j] = 'Q';
            nQueens(board, i+1); // recursive func call
            board[i][j] = 'x';  // backtracking step
            //printBoard(board);

        }
    }

    static void printBoard(char board[][]){
        System.out.println("_________ Chess Board _________");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            
        }
    }

}
