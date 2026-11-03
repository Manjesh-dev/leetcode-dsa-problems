class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || s.charAt(i) != st.peek()) {
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return new String(ans.reverse());
    }
}