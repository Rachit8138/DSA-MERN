//Problem : Search for key in sorted matrix

public class SearchInSorted {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = n-1;

        while(j>=0 && i<n) {
            if(matrix[i][j] == key) {
                System.out.println("Found at (" + i +"," + j + ")");
                return true;
            }
            //go down
            else if(matrix[i][j] < key) {
                i++;
            }
            //go left
            else if(matrix[i][j] > key) {
                j--;
            }
        }

        System.out.println("NOT Found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        int key = 33;
        // staircaseSearch(matrix, key);
        System.out.println(searchMatrix(matrix,key));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int start =0, end = matrix[0].length-1, i=0;
        while (start<=end){
            int mid =(start+end)/2;
            
            if (matrix[i][mid]==target){
                return true;
            }else if (matrix[i][mid]<target){
                start = mid+1;
            }else {
                end= mid-1;
            }
            
            if(matrix[i][mid-1]<target && target<matrix[i][mid+1] ){
                i++;
            }
        }
        return false;
    }
}
