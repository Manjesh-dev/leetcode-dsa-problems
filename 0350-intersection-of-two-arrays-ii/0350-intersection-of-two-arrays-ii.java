class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap <Integer, Integer> map1 = new HashMap<>();
        
        for (int i : nums1) {
            map1.put(i, map1.getOrDefault(i,0)+1);   
        }
        for (int i = 0; i < nums2.length; i++) {
            if(map1.getOrDefault(nums2[i], 0) > 0){
                ans.add(nums2[i]);
                map1.put(nums2[i], map1.get(nums2[i])-1); 
            }
        }
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result; 
    }
}