class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]);
            temp.reverse();
            ans.append(temp);
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();  
    }
}