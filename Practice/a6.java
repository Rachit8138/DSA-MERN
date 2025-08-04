package Practice;

public class a6 {
    public static class Queue{
        static int size;
        static int rear;
        static int []arr;

        public Queue(int n){
            size = n;
            rear = -1;
            arr = new int[n];
        }
        
        public boolean isEmpty(){
            return rear ==-1;
        }

        public void add(int data){
            // check if full
            if(rear == size -1){
                System.out.println("full");
                return;
            }

            rear = rear +1;
            arr[rear]= data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
                
            }

            int front = arr[0];
            for(int i = 0; i <rear;i++ ){
                arr[i]=arr[i=1];
            }
            rear--;
            return front; 
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
                
            }
            int front = arr[0];
             return front; 


        }

    }
    public static void main(String []args){
        Queue q = new Queue(3);

            q.add(1);
            q.add(2);
            q.add(3);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }

    }
}
