class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            if(c > 64 && c < 91) {
                c = (char)(c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}