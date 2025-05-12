public class a1 {
    public static void oddoreven_using_and(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void get_ith_Bit(int a, int i) {
        int bitMask = 1 << i; // this gives left shift by i
        if ((a & bitMask) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static void set_ith_Bit(int a, int i) {
        int bitMask = 1 << i; // this gives left shift by i
        System.out.println(a | bitMask);
    }

    public static int clr_ith_Bit(int a, int i) {
        int bitMask = ~(1 << i);
        System.out.println(a & bitMask);
        return 0;
    }

    public static void upd_ith_Bit(int a, int i, int newBit) {
        // if ((newBit==0)){
        // clr_ith_Bit(a, i);
        // }
        // else{
        // set_ith_Bit(a, i);
        // }

        // a = clr_ith_Bit(a, i);
        // int BitMask = newBit << i;
        // System.out.println(a | BitMask);

        
        int bitmask=~(1<<i);
        a= a & bitmask;
        bitmask=newBit<<i;
        System.out.println(a|bitmask);
    }

    public static void clr_last_ith_Bit(int a, int i) {
        int bitMask = (~0) << i;
        System.out.println(a & bitMask);
    }

    public static void clr_range_ith_Bit(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        System.out.println(n & bitmask);
    }

    public static void ispoweroftwo(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void count_set_bit(int n){
        int count=0;
        while(n>0){     // check LSB
            if ((n&1)!=0){
                count++;
            }
            n=n>>1; // right shift by 1
        }
        System.out.println(count);
    }

    public static void fast_expo(int a, int n){
        int ans=1;
        while(n>0){         
            if((n&1)!=0){
                ans=ans*a;
                }
                a=a*a;
                n=n>>1;
        }
        System.out.println(ans);
    }       
    public static void main(String args[]) {
        oddoreven_using_and(3);
        get_ith_Bit(15, 2); // with which you will be adding or something that is called bitmask
        set_ith_Bit(10, 2); // remember the concept of bitmask
        clr_ith_Bit(10, 1);
        upd_ith_Bit(15, 2, 1);
        clr_range_ith_Bit(10, 2, 4);
        clr_last_ith_Bit(15, 2);
        ispoweroftwo(8);
        count_set_bit(15);
        fast_expo(5,3);
    }
}