class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int l =0;
        int r= 0;
        int max = 0;
        int maxFreq = 0;

        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);  
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            while((r-l+1) - maxFreq > k){
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)-1);
                l++;   
            } 
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
        
    }
}