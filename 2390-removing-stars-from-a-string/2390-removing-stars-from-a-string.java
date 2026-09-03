class Solution {
    public String removeStars(String s) {
        Stack<Character> t = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                t.push(s.charAt(i));
            }else{
                t.pop();
            }
        }
        char ans[] = new char[t.size()];

        for (int i = t.size()-1; i >= 0; i--) {
            ans[i] = t.peek();
            t.pop();
        }
        return new String(ans);
    }
}