import java.util.*;

public class a_6 {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarray(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
        int curr=i;
        int prev = i-1;
        //finding out the correct pos to insert
        while(prev >=0 && arr[prev] > arr[curr]) {
            arr[prev+1] = arr[prev];
            prev--;
        }
        // insertion
        arr[prev+1] = arr[curr];
    }
    printarray(arr);
}

    public static void countingSort(int arr[]) {
    // Find the largest value in the array to determine the size of the count array
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }

    // Create a count array and tally occurrences of each number
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    // Fill the original array in descending order based on the count array
    int j = 0;
    for (int i = count.length - 1; i >= 0; i--) { // Traverse from largest to smallest
        while (count[i] > 0) { // Add numbers to the sorted array
            arr[j] = i;
            j++;
            count[i]--; // Decrement the count
        }
    }
    printarray(arr);
}
    // to print the output
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

        public static void main(String args[]) {
            int arr[] = { 5, 4, 9, 1, 2, 3 };
            bubbleSort(arr);
            selectionSort(arr);
            insertionSort(arr);
            countingSort(arr);
            Arrays.sort(arr);
        }

}
