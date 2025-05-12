package function.method;

public class f3 {
    public static int bincof(int n, int r){
        int fact_n= factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial (n-r);

        int bincof=fact_n /(fact_r*fact_nr)
        return bincof;
    }
    public static void main(String[] args) {
        System.out.println(bincof(5,2));
    }
}
