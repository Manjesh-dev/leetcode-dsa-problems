class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(p.length() > s.length()){
            return list;
        }

        for (int i = 0; i < p.length(); i++) {
            map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (map1.equals(map2)) {
            list.add(0);
        }

        int l = 0;
        int r = p.length();

        while (r < s.length()) {
            map2.put(s.charAt(l), map2.getOrDefault(s.charAt(l), 0) - 1);
            if (map2.get(s.charAt(l)) == 0) {
                map2.remove(s.charAt(l));
            }
            l++;
            map2.put(s.charAt(r), map2.getOrDefault(s.charAt(r), 0) + 1);
            if (map1.equals(map2)) {
                list.add(l);
            }
            r++;
        }
        return list;
        
    }
}