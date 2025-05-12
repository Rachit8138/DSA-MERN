package function;
import java.util.Scanner;

public class h2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int x = sc.nextInt();
        System.out.println(isEven(x));
        if(isEven(x)){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    
    public static boolean isEven (int n){
            if (n%2==0){
                return true;
            }
            else{
                return false;
            }   
    }
}


