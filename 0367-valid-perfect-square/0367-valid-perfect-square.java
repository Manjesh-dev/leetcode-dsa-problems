class Solution {
    public boolean isPerfectSquare(int num) {
        
        int l = 1;
        int r = num/2+1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if(mid == num/mid && num % mid == 0){
                return true;
            }
            if (mid > num/mid) {
                r = mid-1;
            }else{
                l =mid+1;
            }   
        }
        return false;
        
    }
}