
public class a_1 {
    public static void countno(int arr[][]){
        int c=0;
        for (int row=0; row<arr.length; row++){
            for(int col=0;col<arr[0].length;col++ ){
                if(arr[row][col]==7){
                     c++;
                }

            }
        }
        System.out.println(c);

    }

    public static void transposeMatrix(int arr[][]){
        int n=arr.length;       // no of rows
        int m= arr[0].length;   // no of columns
        int ans[][]=new int [m][n];

        for (int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=arr[j][i];
            }
        }

        for(int i=0; i<ans.length; i++){
            for (int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String arrgs[]) {
        int arr[][]={{2,3,5,},{5,7,2,}};
        /* countno(arr); */
        transposeMatrix(arr);
        
        /* int [][]arrr=new int[5][3];
        System.out.println(arrr[1]);
        System.out.println(arrr[1][0]); */
    }
}