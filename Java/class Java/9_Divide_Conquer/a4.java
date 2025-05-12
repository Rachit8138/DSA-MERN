//imporved code
public class a4 {
    public static void printArr(int arr[]){
        System.out.println("The sorted array using Quick Sort technique is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSortMethod(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotIdx = partition(arr, si, ei);
        quickSortMethod(arr, si, pivotIdx-1);
        quickSortMethod(arr, pivotIdx+1, ei);
    }
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<=ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return i;
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSortMethod(arr, 0, arr.length-1);
        
        System.out.println(arr);//this will print the memory type and location
        printArr(arr);
    }
}
