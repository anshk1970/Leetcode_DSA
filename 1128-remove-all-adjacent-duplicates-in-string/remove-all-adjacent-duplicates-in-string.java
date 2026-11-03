class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int length = sb.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (length > 0 && sb.charAt(length - 1) == c) {
                sb.deleteCharAt(length - 1);
                length--;
            } else {
                sb.append(c);
                length++;
            }
        }
        return sb.toString();
    }
}