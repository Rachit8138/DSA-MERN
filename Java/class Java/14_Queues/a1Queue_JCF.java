import java.util.*;
public class a1Queue_JCF {

    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();// two classes can implement queue arraydeque and linkelist 
/* 
queue in jcf is not classs but an interface we cannot make
 object of interfaces, so queue lae implement garne classes
  ko object banauchau

  queue is basically implemented by 2 classes linkedlist and arraydeque

  JCF- -> leetcode and online portals for solving qn 
  Scratch -> if asked to do in interview only 

 */
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        System.out.print(q.isEmpty());

    

    }
    
}
