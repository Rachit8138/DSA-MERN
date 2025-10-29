public class a {
     // comme
    public static String reverseWords(String s) {
        s=s.trim();
        StringBuilder sum= new StringBuilder();
        int a=s.length();
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i) == ' '){
                if (!s.substring(i+1, a).equals("")){
                sum = sum + s.substring(i+1, a) + " ";
                }
                System.out.println(sum);
                a=i;
            }
        }
        sum=sum+s.substring(0, a);
        return sum; 
    }
    public static void main(String[] args) {
    
        String s="a good      example";
        System.out.println(reverseWords(s));

    }
}
