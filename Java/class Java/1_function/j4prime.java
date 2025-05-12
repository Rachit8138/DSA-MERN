package function;

// find prime in a range
public class j4prime {
    /*
     * public static void main(String[] args)
     * {
     * for (int i=1;i<=10; i++){
     * int c=0;
     * for (int j=1;j<=i;j++){
     * if (i%j==0){
     * c++;
     * }
     * }
     * if (c==2){
     * System.out.println(i);
     * }
     * }
     * }
     */

    public static void primesInRange(int n) {
        for (int i=2; i<=n; i++) {
        if(isPrime (i)) { //true
        System.out. print(i+" ");
        }
    }
        Syste
        
        m.out.println();
        
    }

    public static void main (String argsll) {
        primesInRange(20);
    
}
