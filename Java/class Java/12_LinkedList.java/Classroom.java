//done
import java.util.LinkedList; 

public class Classroom {
    public static void main(String args[]) {
        //create - 
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }

    // see here you mc, this is easier approach but in interivew you will be asked to do from scratch, 
    //DSA means building from scratch so you will need to know teh scratched approach too
}
