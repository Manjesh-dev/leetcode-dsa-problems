class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.getOrDefault(t.charAt(i),0) > 0) {
                if(map.getOrDefault(s.charAt(i),-1) == 0){
                    map.remove(s.charAt(i));
                }
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
            }else{
                return false;
            }
        }
        return true;
        
    }
}