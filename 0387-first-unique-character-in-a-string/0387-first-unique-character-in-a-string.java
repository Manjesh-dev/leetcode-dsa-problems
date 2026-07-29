class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map1.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
    }
}