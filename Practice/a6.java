package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class a6 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.print(q.remove());
        }
        System.out.println();

        System.out.println(q.isEmpty());
    }
    
}
