class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = k;
        double maxAvg = Double.NEGATIVE_INFINITY;

        double newSum = 0;
        for (int i = 0; i < k; i++) {
            newSum = newSum + nums[i];
        }    
        double avg = 0;
        while (r < nums.length) {
           avg = newSum/k;
           maxAvg = Math.max(maxAvg, avg);
           newSum = newSum - nums[l] + nums[r];
           l++;
           r++;
        }
        avg = newSum/k;
        maxAvg = Math.max(maxAvg, avg);
        return maxAvg; 
    }
}