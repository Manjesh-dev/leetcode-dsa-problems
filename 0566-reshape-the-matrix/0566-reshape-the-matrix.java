class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];

        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int l = 0;
        int m = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = mat[l][m];
                if (m == mat[l].length-1) {
                    m = 0;
                    l++;
                }else{
                    m++;
                }
            }
        }

        return ans;
    }
}