public class a0 {
 



    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4,5, 6,7};
        int key = 3;
        // for finding the index of a number
        if (binarySearch(numbers, key) == -1) {             //very important
            System.out.println("not found");
        } else {
            System.out.println("index for key is " + binarySearch(numbers, key));
        }
    }

    public static int binarySearch(int numbers[], int key){
        int start =0; int end = numbers.length -1; int mid;
        while(start<=end){
             mid = start -(start-end)/2;
            if(numbers[mid]>key){
                end = mid-1;
            }else if(numbers[mid]<key){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
