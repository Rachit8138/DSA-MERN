public class a {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            Integer count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            sb.append(chars[i]);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        
        // ✅ Create an object of class 'a'
        a obj = new a();
        
        // ✅ Call the method through the object
        System.out.println(obj.compress(chars));
    }
}
