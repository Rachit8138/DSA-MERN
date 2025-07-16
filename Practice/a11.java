package Practice;

public class a11 {
    public static class Queue {
        static int []arr;
        static int size;
        static int rear;

        public Queue(int data){
            arr= new int[data];
            size = data;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            // see for full
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear = rear +1;
            arr[rear]=data;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

        public static int remove(){
            if (isEmpty()) {
                System.err.println("empty");
                return -1;
            }
            int top = arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            rear= rear-1;
            return top;
        }

        public static void print(){
            for(int a: arr){
                System.out.print(a+" ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());


    }

}
