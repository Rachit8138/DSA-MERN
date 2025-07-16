import java.util.*;
public class a10Deque_ {
    
  /* this shoudl be included in the notes just know that there are such functions  */
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();

        d.addFirst(1);
        d.addLast(2);
        d.addFirst(3);
        d.addLast(4);
        
        System.out.println(d);

        d.removeLast();
        
        System.out.println(d);

        d.removeFirst();

        System.out.println(d);
        System.out.println("fist el ="+d.getFirst());
        System.out.println("fist el ="+d.getLast());

        

    }
}
