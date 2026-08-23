class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = 0;
        for (int i = 0; i < piles.length; i++) {
            r = Math.max(r, piles[i]);
        }
        int l = 1;
        while (l<=r) {
            int mid = l+(r-l)/2;
            long hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours = hours + (long)Math.ceil((double) piles[i] / mid);
            }
            if (h < hours) {
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return l;
    }
}