class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                count++;
                maxOne = Math.max(maxOne, count); 
            }else{
                count = 0;
            }
            // if(nums[i] == 0){
            //     count = 0;
            // }
            // maxOne = Math.max(maxOne, count);   
        }
        return maxOne;  
    }
}