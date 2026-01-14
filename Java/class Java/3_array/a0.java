import java.util.Arrays;

public class a0 {

    class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int j=m;j<m+n;j++){
            arr[j]=nums2[j];
        }
        
        Arrays.sort(nums1);
        return arr;
        
    }
}

}
