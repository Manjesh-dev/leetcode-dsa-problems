class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();

        int c = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                c++;
            }
            if (c == 0) {
                s1.append(s.charAt(i));
            }
            if (c > 0 && s.charAt(i) != '#') {
                c--;
            }
        }
        int c1 = 0;
        for (int i = t.length() - 1; i >= 0; i--) {
            if (t.charAt(i) == '#') {
                c1++;
            }
            if (c1 == 0) {
                t1.append(t.charAt(i));
            }
            if (c1 > 0 && t.charAt(i) != '#') {
                c1--;
            }
        }
        if (s1.length() != t1.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != t1.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}