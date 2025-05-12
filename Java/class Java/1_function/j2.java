package function;

public class j2 {   //error 
    
    public static int bincoef(int n, int r){
        int fact_n= factorial ( n);// factorial function 
        int fact_r= factorial ( r);
        int fact_nmr= factorial ( n-r);
        int bincoef =fact_n/(fact_r*fact_nmr);
        return bincoef;
    }
    public static void main(String[] args) {
        System.out.println(bincoef(5,2));
    }
}
