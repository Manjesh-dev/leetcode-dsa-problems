class Solution {
    public int lengthOfLastWord(String s) {
        // s = s.strip();
        // String[] word = s.split(" ");
        // return word[word.length-1].length();

        s = s.strip();
        int count = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}