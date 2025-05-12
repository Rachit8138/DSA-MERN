package function.method;

public class f1 {
   public static void swap(int a, int b){
    int temp = a;
    a=b;
    b=temp;
 
   }
   
    public static void main(String args[]) {
         int a =5;
         int b =7;
         swap(a, b);
        System.out.println("a="+a);
        System.out.println("a="+b);
    }
}

