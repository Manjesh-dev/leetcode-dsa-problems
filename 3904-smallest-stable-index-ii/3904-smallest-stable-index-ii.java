class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] max = new int[n];
        max[0] = nums[0];
        
        for (int i = 1; i < n; i++) {
            max[i] = Math.max(nums[i], max[i-1]);
        }

        int[] suffMin = new int[n];
        suffMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffMin[i] = Math.min(nums[i], suffMin[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            if(max[i]-suffMin[i] <= k){
                return i;
            }
        }
        return -1;

    }
}