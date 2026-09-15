class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];
        int j = 0;
        int l = ans.length-1;
        for(int i=0; i<ans.length; i++){
            if(nums[i]%2 == 0){
                ans[j] = nums[i];
                j++;
            }else{
                ans[l] = nums[i];
                l--;
            }

        }
        return ans;
        
    }
}