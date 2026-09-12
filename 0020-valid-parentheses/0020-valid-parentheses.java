class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if(!st.empty()){

            if ((s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == '}' && st.peek() == '{')
                    || (s.charAt(i) == ']' && st.peek() == '[')) {
                st.pop();
            }
            }
            // if ((!st.empty()) && s.charAt(i) == '}' && st.peek() == '{') {
            //     st.pop();
            // }
            // if ((!st.empty()) && s.charAt(i) == ']' && st.peek() == '[') {
            //     st.pop();
            // }
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                c++;
                st.push(s.charAt(i));
            }
        }

        if (st.size() == 0 && c == s.length() / 2) {
            return true;
        }
        return false;

    }
}