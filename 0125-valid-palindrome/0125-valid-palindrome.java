class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                t.append(s.charAt(i));
            } 
        }
        int left = 0;
        int right = t.length()-1;
        while (left<right) {
            if(t.charAt(left) != t.charAt(right)){
                left++;
                right--;
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}