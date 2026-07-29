class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                t.append(s.charAt(i));
            }
        }
        int l = 0;
        int r = t.length()-1;

        while (l < r) {
            if(t.charAt(l) != t.charAt(r)){
                return false;
            }
            l++;
            r--; 
        }
        return true;
        
    }
}