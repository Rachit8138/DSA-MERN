public class quickSort {
    public static void printArr(int arr[]){
        System.out.println("The sorted array using Quick Sort technique is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSortMethod(int arr[], int si, int ei){  // si = starting index, ei = ending index
        // base condition
        if(si>=ei){
            return;
        }
        // recursion call
        int pivotIdx = partition(arr, si, ei);  
        quickSortMethod(arr, si, pivotIdx-1); // for left part of the array (w.r.t pivot)
        quickSortMethod(arr, pivotIdx+1, ei); // for right oart of the array (w.r.t pivot)
    }
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];  // Just taking for better understanding. Otherwise we can only work with arr[ei]. 
        int i = si-1; // to make the place for the elements less than or equal to pivot
        for(int j=si; j<ei; j++){  // si will varry when the array will be breaked again and again during recursive call.
            if(arr[j] <= pivot){
                i++;
                //swap - with temp variable
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //place pivot at correct position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp; //pivot's position need to change so (pivot = temp) won't work

        return i;
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSortMethod(arr, 0, arr.length-1);
        printArr(arr);
    }
}