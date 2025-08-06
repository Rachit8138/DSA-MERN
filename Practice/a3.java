package Practice;

import java.util.Stack;

public class a3 {
    public static void stockSpan(int stocks[]){
        Stack<Integer> s = new Stack<>(); 
        int span[]=new int[stocks.length];
        span[0]= 1; 
        s.push(0); // storing the index
        
        // iterating 
        for(int i = 0; i<stocks.length;i++){
            // current element 
            int curr = stocks[i]; 
            while(!s.isEmpty() && curr>=stocks[s.peek()]){
                s.pop(); 
            }
            if(s.isEmpty()){
                span[i] = i+1 ; 
            }else{
                span[i] = i-s.peek();
            }
            s.push(i); 
        }

        for(int a : span){
            System.out.print(a+" ");
        }
        
    }
    public static void main(String[] args){
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        stockSpan(stocks);

    }
    
}
