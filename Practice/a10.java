package Practice;

import java.util.ArrayList;

public class a10 {
    public static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data){
            list.add(data);
        }
        public boolean isEmpty(){
            return list.size()==0;
        }

        public int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public void pop(){
            if(list.isEmpty()){
                return;
            }
            list.remove(list.size()-1);
        }
    }

    public static void main(String args[]){
        Stack s= new Stack();
        s.push(0);
        s.push(34);
        s.push(30);

        while(!s.isEmpty()){
            System.out.println(s.peek());

            s.pop();

        }

        System.out.println(s.peek());
    }


    
}
