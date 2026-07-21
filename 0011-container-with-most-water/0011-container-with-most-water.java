class Solution {
    public int maxArea(int[] height) {

        // brute force
        // int maxA = 0;

        // for (int i = 0; i < height.length; i++) {
        //     int waterLavel = 0;
        //     for (int j = i; j < height.length; j++) {
        //         waterLavel = Math.min(height[i], height[j]);
        //         int width = j-i;
        //         int area = waterLavel*width;
        //         maxA = Math.max(maxA, area);
        //     }
        // }

        int maxA = 0;
        int l = 0;
        int r = height.length-1;

        while (l<r) {
            int area = Math.min(height[l], height[r]) * (r-l);
            maxA = Math.max(maxA, area);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }

        }
        return maxA;
        
    }
}