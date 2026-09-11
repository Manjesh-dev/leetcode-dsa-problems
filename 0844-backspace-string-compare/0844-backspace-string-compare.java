class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length()+t.length(); i++) {
            if (s.length()>i && s.charAt(i) == '#' && !st1.empty()) {
                st1.pop();
            }
            if (s.length()>i && s.charAt(i) != '#') {
                st1.push(s.charAt(i));
            }      
            if (t.length()>i && t.charAt(i) == '#' && !st2.empty()) {
                st2.pop();
            }
            if (t.length()>i && t.charAt(i) != '#') {
                
                st2.push(t.charAt(i));
            } 
            
        }
        // for (int i = 0; i < t.length(); i++) {
        // }
        if (st1.equals(st2)) {
            return true;
        }
        return false;
    }
}