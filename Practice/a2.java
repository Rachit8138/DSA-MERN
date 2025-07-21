package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class a2 {
    public static void main(String[] args){
        Queue q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.poll())    ;
        }
    }
    
}
