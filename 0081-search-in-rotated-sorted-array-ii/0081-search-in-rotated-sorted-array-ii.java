class Solution {
    public boolean search(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i] == target){
        //         return true;
        //     }
        // }
        // return false;
         int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] == nums[r] && nums[mid] == nums[l]) {
                l++;
                r--;
            } else if(nums[l] <= nums[mid]) {
                if (nums[mid] > target && target >= nums[l]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else {
                if (nums[mid]<target && nums[r] >= target) {
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
        }
        return false;
        
    }
}