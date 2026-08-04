class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            int currentWords = 1; // A sentence with 0 spaces has at least 1 word
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    currentWords++;
                }
            }
            maxWords = Math.max(maxWords, currentWords);
        }
        
        return maxWords;
    }
}