class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder("");

        for (int i =0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char)(c+32);
            }
            sb.append(c);
        }

        return sb.toString();
    }
}