class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character, Integer> set = new HashMap<>();
        int max = 0;

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.containsKey(s.charAt(i))) {
                set.put(s.charAt(j), set.getOrDefault(s.charAt(j), 0) - 1);
                if (set.get(s.charAt(j)) == 0) {
                    set.remove(s.charAt(j));
                }
                j++;
            }
            set.put(s.charAt(i), set.getOrDefault(s.charAt(i), 0)+1);
            max = Math.max(max, i-j+1);
        }
        return max;
        
    }
}