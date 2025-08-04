package Practice;

public class a7 {
    public static class Queue{
        static int size, rear, front;
        static int []arr;

        public Queue(int n){
            size= n;
            rear = -1;
            front= -1;
            arr= new int[n];
        }
        public  boolean isEmpty(){
            return rear==-1 && front ==-1;

        }
        public  boolean isFull(){
            return (rear+1)%size ==front;
        }


        public  void add (int data){
            // first of all check if full
            if(isFull()){
                System.out.println("full");
                return;
            }
            if(front==-1){
                front =0;
            }

            rear= (rear+1)%size;
            arr[rear]= data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            int temp= arr[front];
            if((front+1)%size==rear){
                front =rear =-1;
            }else{
                front=(front+1)%size;
            }
            return temp;

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            return arr[front];

        }
        


    }
    public static void main(String[] args){
        Queue q= new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        
    }
    
}
