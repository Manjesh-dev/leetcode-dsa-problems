class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        if (nums1.length > nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
            }
            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i])) {
                    list.add(nums1[i]);
                    map.put(nums1[i], map.getOrDefault(nums1[i], 0) - 1);
                    if (map.get(nums1[i]) == 0) {
                        map.remove(nums1[i]);
                    }
                }
            }
        } else {
            for (int i = 0; i < nums1.length; i++) {
                map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i])) {
                    map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
                    if (map.get(nums2[i]) == 0) {
                        map.remove(nums2[i]);
                    }
                    list.add(nums2[i]);
                }
            }
        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;

        
    }
}