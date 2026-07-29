class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder m = new StringBuilder();
        
        
        for (int i = 0; i < word.length; i++) {
            StringBuilder t = new StringBuilder(word[i]);
            t.reverse();
            m.append(t);
            if(i < word.length-1){
                m.append(" ");
            }
        }
        return m.toString();
        
    }
}