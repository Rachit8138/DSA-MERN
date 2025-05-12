public class h1 {
    public static void allOccurences(int arr[], int key, int i){
        // base case
        if(i == arr.length){
            return;
        }

        // recursive case
        if(arr[i]== key){
            System.out.print(i+" ");
        } 
        allOccurences(arr, key, i+1);


    }
    

public static void main(String[]args) {
    int arr[] = {3,2,4,5,6,2,7,2,2};
    int key=2;
    allOccurences(arr ,key ,0);
    System.out.println();
}
}
