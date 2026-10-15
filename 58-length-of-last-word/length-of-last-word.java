class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return trimmed.length();
        }
        return trimmed.length() - lastSpaceIndex - 1;
    }
}