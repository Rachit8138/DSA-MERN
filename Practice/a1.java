package Practice;

import java.util.*;

public class a1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(4);

        // System.out.println(list.set(2,2));;

        maxi(list);
        System.out.println(list);
    }

    public static void maxi(ArrayList<Integer> list){
        int max=list.get(0);
        /* for(int i =0; i<list.size();i++){
            max=Math.max(max, list.get(i));
        } */


        for (int a : list){
            max=Math.max(max, a);
        }
        System.out.println(max);
    }
    
}
