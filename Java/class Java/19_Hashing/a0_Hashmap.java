import java.util.HashMap;

public class a0_Hashmap{
    public static void main(String args[]){

        //Create

        HashMap<String,Integer> hp = new HashMap<>();

        hp.put("one",1);
        hp.put("two",2);
        hp.put("three",3);
        hp.put("four",4);

        System.out.println(hp);

        //remove
       System.out.println( hp.remove("four"));;
        System.out.println(hp);
        
        //get
        System.out.println(hp.get("one"));

        //contains

        System.out.println(hp.containsKey("three"));
        System.out.println(hp.containsKey("five"));


        
    }
}