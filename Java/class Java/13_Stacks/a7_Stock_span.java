import java.util.*;
//Stock Span Problem
// very imp asked in MS, flipkart, Adobe, samsung
public class a7_Stock_span {
    public static void stockSpan(int stocks[]) {
        Stack<Integer> s = new Stack<>();
        int span[] = new int[stocks.length];
        span[0] = 1;// for the first number 
        s.push(0); 
        for(int i=1; i<stocks.length; i++) {
            int curr = stocks[i];
            // while not completely empty curr greater than top element
            while(!s.isEmpty() && curr >= stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {// if empty
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }

        for(int i=0; i<span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
    public static void main(String args[]) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        stockSpan(stocks);

    }
}

/* 
 Reason:
Day 0: price 100 → No previous day → span = 1

Day 1: price 80 < 100 → span = 1

Day 2: price 60 < 80 → span = 1

Day 3: price 70 > 60 → 2 consecutive days (60 then 70) → span = 2

Day 4: price 60 < 70 → span = 1

Day 5: price 85 > 60, 70, 60, 80 → span = 5

Day 6: price 100 > all previous → span = 7
 */