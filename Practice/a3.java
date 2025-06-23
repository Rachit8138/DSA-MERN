package Practice;

class Solution {
    public int maxArea(int[] height) {
        int rptr=0, lptr=height.length-1, max=0;
        while(lptr<rptr){
            int ht=Math.min(height[lptr],height[rptr]);
            int wt=rptr-lptr;
            int curr=ht*wt;
            max=Math.max(max, curr);

            if(height[lptr]<height[rptr]){
                lptr++;
            }else{
                rptr--;
            }
        }
        return max;    
    }
}
