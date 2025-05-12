package function;
import java.util.Scanner;

public class h5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int x = sc.nextInt();
        System.out.println("the sum of the digits is:"+sum(x));
    }
    
    public static int sum(int n){
        int sum=0;
        while (n>0){
            int last=n%10;
            sum=sum+last;
            n/=10;

        }
        return sum;
    }
}


