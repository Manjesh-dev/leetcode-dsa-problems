class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        int i = ans.length-1;

        while (l <= r) {
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                ans[i] = nums[l]*nums[l];
                l++;
                i--;
            }else{
                ans[i] = nums[r]*nums[r];
                r--;
                i--;
            }
        }
        return ans;
        
    }
}