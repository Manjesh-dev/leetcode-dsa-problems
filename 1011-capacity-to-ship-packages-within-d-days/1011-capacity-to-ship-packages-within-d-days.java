class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int r = 0;
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            r += weights[i];
            l = Math.max(l, weights[i]);
        }
        
        while (l<=r) {
            int mid = l + (r-l)/2;
            int d = 1;
            int sum = 0;
            for (int i = 0; i < weights.length; i++) {
                sum += weights[i];
                if(sum > mid){
                    sum = weights[i];
                    d++;
                }
            }
            if (days < d) {
                l = mid + 1;
            } else {
                r = mid - 1;   
            }
        }
        return l;
        
    }
}