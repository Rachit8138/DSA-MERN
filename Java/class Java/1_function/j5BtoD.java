package function;

public class j5BtoD {
        public static void binToDec(int binNum) {
            int pow = 0;
            int decNum = 0;
    
            while (binNum > 0) {
                int lastDigit = binNum % 10;
                decNum = decNum + (lastDigit * (int) Math.pow(2, pow)); //type cast
                pow++;
                binNum = binNum / 10;
            }
    
            System.out.println("Decimal equivalent: " + decNum);
        }
        
        public static void dectobin(int n){
            int po=0;
            int bin=0;

            while (n>0){
                int rem=n%2;
                bin=bin+(rem*(int)Math.pow(10,po));
                po++;
                n=n/2;
            }
            System.out.println(("Binary equivalent"+bin));
        }


    
        public static void main(String[] args) {
            // Replace with your binary number
            binToDec(1010101);
            dectobin(78);

        }
}
