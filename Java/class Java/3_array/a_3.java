public class a_3 {
    public static int binarySearch(int numbers[], int key) {                
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            
            // comparisons
            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
            
            
        }
        return -1;
    }

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {  //you can but<= but it will just be a repeated step 
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;    
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++){
            System.out.print("(" + numbers[i] + "," + numbers[j] +")");
            }
            System.out.println();}   
    }

    public static void printSubarrays(int numbers[]){
        //i=start and j=end
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4,5, 6,7};
        int key = 3;
        // for finding the index of a number
        if (binarySearch(numbers, key) == -1) {             //very important
            System.out.println("not found");
        } else {
            System.out.println("index for key is " + binarySearch(numbers, key));
        }
 
        // reverse of a number
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
         // pairs in an array
        printPairs(numbers);
        //print subarrays, a continous part of array
        printSubarrays(numbers); 

    }
}
 

/* 
public class a_4 {

    public static void printSubarrays(int numbers[]) {
        // i=start and j=endz
        int sum=0;
        int g=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum=sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                if(g<sum){
                    g=sum;
                }
                sum=0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The largest subarray is: "+g);
    }

    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        printSubarrays(numbers);
    }
}  */