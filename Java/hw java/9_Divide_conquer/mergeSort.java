public class mergeSort {
    // sorting method (to do step1(divide) & step2(sort parts))
    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    // merge method to merge the sorted parts
    public static void merge(String arr[], int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;     // idx for 1st sorted part
        int j = mid + 1;  // idx for 2nd sorted part
        int k = 0;      // idx for temp

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];   
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover elements of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0; k < temp.length; k++) {
            arr[k+si] = temp[k];
        }
    }

    public static void printArr(String arr[]) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}













/* class h1 {

    // Function to perform merge sort on an array of strings
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            return new String[]{arr[lo]};
        }
        
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(arr, lo, mid);
        String[] arr2 = mergeSort(arr, mid + 1, hi);
        return merge(arr1, arr2);
    }

    // Function to merge two sorted arrays
    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];
        int idx = 0, i = 0, j = 0;

        // Merge arrays while comparing elements
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }

        // Append remaining elements
        while (i < m) {
            arr3[idx++] = arr1[i++];
        }
        while (j < n) {
            arr3[idx++] = arr2[j++];
        }

        return arr3;
    }

    // Return true if str1 is alphabetically smaller than str2
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    // Main method to test the merge sort function
    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] sortedArr = mergeSort(arr, 0, arr.length - 1);
        
        // Print the sorted array
        for (String str : sortedArr) {
            System.out.println(str);
        }
    }
}
 */