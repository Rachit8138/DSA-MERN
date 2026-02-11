public class transpose {
    public static int[][] transpose(int matrix[][]) {
        int row = matrix[0].length;
        int col = matrix.length;
        int res[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            { 1, 2, 3 },
            { 5, 6, 7 }
        };

        int[][] result = transpose(matrix);

        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }
}
