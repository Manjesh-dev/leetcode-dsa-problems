class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // if (nums[0] != 0) {
        //     return 0;
        // }
        // for (int i = 0; i < nums.length - 1; i++)
        //     if (nums[i + 1] - nums[i] == 2) {
        //         return nums[i] + 1;
        //     }
        // return nums.length;

        int oldSum = 0;
        int newSum = 0;
        for(int i = 0; i<=nums.length; i++){
            if(i < nums.length){
                oldSum += nums[i];
            }
            newSum += i;
            
        }

        // int newSum = (nums.length*(nums.length+1))/2;

        return newSum-oldSum;
    }
}