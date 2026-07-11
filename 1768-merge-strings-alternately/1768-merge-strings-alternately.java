class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();

        int n = Math.min(word1.length(), word2.length());
        for (int i = 0; i < n; i++) {
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            for (int i = n; i < word1.length(); i++) {
                merge.append(word1.charAt(i));
            }
        } else {
            for (int i = n; i < word2.length(); i++) {
                merge.append(word2.charAt(i));
            }
        }

        return merge.toString();
        
    }
}