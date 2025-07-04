// leetcode 932

import java.util.*;
/* 

class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(1);
        while (nums.size()<n){
        ArrayList<Integer> temp= new ArrayList<>();
            // *2
            for(int x : nums){
                if(x*2<=n) temp.add(x*2);
            }

            //*2 -1
            for(int x : nums){
                if(x*2-1<=n) temp.add(x*2-1);
            }
            nums = temp;
        }
        int []array=new int[n];
        for(int i=0;i<nums.size();i++){
            array[i]=nums.get(i);
        }
        return array;
    }
}
    
 */

public class BeautifulArray {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            int ans_size = ans.size();
            for (int i = 0; i < ans_size; i++) {
                if ((ans.get(i) * 2 - 1) <= n) {
                    temp.add(ans.get(i) * 2 - 1);
                }
            }
            for (int i = 0; i < ans_size; i++) {
                if ((ans.get(i) * 2) <= n) {
                    temp.add(ans.get(i) * 2);
                }
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(beautifulArray(5));
    }
}
