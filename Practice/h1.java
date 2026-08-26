public class h1 {
    
    public  static String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replace(part,"");
        }
        return s;
    }

    public static void main(String[] args) {
        
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part));
    }
}
