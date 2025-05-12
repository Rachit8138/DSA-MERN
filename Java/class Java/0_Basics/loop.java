/*  // reads set of integer and then prints sum of odd and even integers
 import java.util.*;
 public class loop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int a = sc.nextInt(), even=0, odd=0;
        for (int i=1; i <=a; i++){
            if ((i % 2) ==0){
                even +=i;
            }
            else {
                odd+=i;
            }
        }
        System.out.println("the sum of even is "+even);
        System.out.println("the sum of odd is "+odd);
 }
} */

/* 
// find the factorial
import java.util.*;
 public class loop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive number");
        int a = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=a ; i++) {
            fact *= i;
        }
        System.out.println("the factorial is "+fact);
    }
}
 */

 //multiplication table 
import java.util.*;
 public class loop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive number"); 
        int a = sc.nextInt();
        for (int i=1; i<=10 ; i++) {
            System.out.println(a+"*"+i+"="+(a*i));
            }
        }

    }
    

