package Practice;

import java.util.Stack;

public class a111 {
    public static int Histogram(int[] height){
        Stack<Integer> s = new Stack<>(); 
        int h= height.length;
        // declare the array to store next left and right 
        int[] nsl = new int[h];
        int[] nsr = new int[h];
        int area = 0;
        int max=0;


        // next small left

        for(int i = 0; i<h;i++){
            // current element height[i]
            while(!s.isEmpty() && height[i]<=height[s.peek()]){
                s.pop();// pop until you keep a smaller number which does not satisfy the condition 
            }
            if(s.isEmpty())nsl[i]=-1;
            else nsl[i]=s.peek();
            s.push(i);
        }

        s = new Stack<>();

        // next small right 
        for(int i = h-1; i>=0;i--){
            // current element height[i]
            while(!s.isEmpty() && height[i]<=height[s.peek()]){
                s.pop();// pop until you keep a smaller number which does not satisfy the condition 
            }
            if(s.isEmpty())nsr[i]=h;
            else nsr[i]=s.peek();
            s.push(i);
        }
        // find the area= height * width 
        for(int i=0; i<height.length;i++){
            int width =nsr[i]-nsl[i]-1;
            int ht= height[i];
            area = width*ht;
            max = Math.max(max, area);
        }
        return max;
    }
    public static void main (String[] args){
        int[] height={2,1,5,6,2,3};

        System.out.println(Histogram(height));
    }
    
}
