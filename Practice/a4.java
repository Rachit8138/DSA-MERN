package Practice;

import java.util.Stack;

public class a4 {
    public static void main(String[] args){
        int []arr= {6,8,0,1,3};
        Stack<Integer> s = new Stack<>(); 
        int []span = new int[arr.length]; 

        // iterating from reverse 
        for(int i =arr.length-1; i>= 0; i--){
            // current element 
            int curr = arr[i];
            while(!s.isEmpty() && curr>=arr[s.peek()]){
                s.pop();
            }if(s.isEmpty()){
                span[i]=-1;
            s.push(i);
                
            }else{
                span[i]=arr[s.peek()];
            }
        }

        for(int i: span){
            System.out.print(i+" ");
        }

    }
    
}
