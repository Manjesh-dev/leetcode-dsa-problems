class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long)Math.sqrt(c);
       

        while (l<=r) {
            long s = (long)Math.pow(l, 2) + (long)Math.pow(r, 2);
            if (s==c) {
                return true;
            }
            if(s > c){
                r--;
            }else{
                l++;
            }
        }
        return false;
        
    }
}