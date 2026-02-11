
public class DiagonalSum {
    public static int calcSum(int matrix[][]) {
        int sum = 0;
        //primary
        for(int i=0; i<matrix.length; i++) {
            sum += matrix[i][i];
        }
        
        //secondary
        for(int j=matrix.length-1, i=0; j>=0; j--,i++) {
            if(i == j) {
                continue;
            }
            sum += matrix[i][j];
        }
        
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        System.out.println(calcSum(matrix));
    }
}
// leetcode

/* class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        // primary diagonal i==j
        // secondary diagonal i+j==n-1
        for(int i =0,j=mat.length-1;i<mat.length; i++,j-- ){
            sum+=mat[i][i];
            if(i==j) continue;
            sum+=mat[j][i];
        }
        return sum;
    }
} */