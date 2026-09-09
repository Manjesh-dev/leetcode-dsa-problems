class Solution {
    public int diagonalSum(int[][] mat) {
        // int sum1 = 0;
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++) {
        //         if (i == j) {
        //             sum1 += mat[i][j];
        //         }
        //         if (j == mat[i].length - 1 && i != (Math.abs(j-i))) {
        //             sum1 += mat[i][Math.abs(j-i)];
        //         }
        //     }
        // }
        int l = 0;
        int sum = 0;
        while (l<mat.length) {
            sum += mat[l][l];
            if(l != (mat.length-1-l)){
                sum += mat[l][mat.length-1-l];
            }
            l++;
        }
        return sum;

    }
}