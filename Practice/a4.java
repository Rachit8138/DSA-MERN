package Practice;

public class a4 {
    public static class Queue{
        static int size;
        static int rear; 
        static int []arr; 
        public Queue(int n){
            size = n; 
            rear = 0; 
            arr= new int[n];
        }
        public boolean isEmpty(){
            return rear ==-1;
        }
        
        public  void add(int data){
            // if full 
            if(rear == size -1){
                System.out.println("full");
                return;
            }
            arr[rear++]=data;
        }

        public int remove() {
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            int temp = arr[0];

            for(int i=0; i< rear; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return temp;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
    
}
