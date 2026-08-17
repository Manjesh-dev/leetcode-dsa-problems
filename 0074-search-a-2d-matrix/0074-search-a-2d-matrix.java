class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;

        while (l <= r) {
            int mid1 = l + (r-l)/2;

            int m = 0;
            int n = matrix[mid1].length-1;
            while (m <= n) {
                int mid = m + (n - m) / 2;

                if (matrix[mid1][mid] == target) {
                    return true;
                }
                if (matrix[mid1][mid] > target) {
                    n = mid - 1;
                } else {
                    m = mid + 1;
                }
            }
            if (matrix[mid1][0] > target) {
                r = mid1 - 1;
            }else{
                l = mid1 + 1;
            }
        }
        return false; 
    }
}