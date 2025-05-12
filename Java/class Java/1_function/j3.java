
 package function;

 public class j3 {
     // func to calc sum of 2 nums
     public static int sum(int a, int b) {
         return a + b;
     }
 
     // func to calc sum of 3 nums
     public static int sum(int a, int b, int c) {
         return a + b + c;
     }
     
     public static float sum(float a, float b) {
        return a+b;
    }
 
     public static void main(String[] args) {
         System.out.println(sum(3, 5));         // function overloading using parameter
         System.out.println(sum(5, 2, 1));    // function overloading using parameter
         System.out.println(sum(3.2f,4.5f));    // function overloading using datatype
     }
 }
 