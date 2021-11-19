public class UniquePaths {
    // use dp with memorization to solve the puzzle
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return recursion(m, n, dp);
    }

    public int recursion(int m, int n, int[][] dp) {
        if(m < 1 || n < 1) {
            return 0;
        }
        if(m == 1 || n == 1) {
            return 1;
        }
        if(dp[m][n] != 0) {
            return dp[m][n];
        }
        else {
            // robot could only either go down or go right to reach the destination
            dp[m][n] = recursion(m-1, n, dp) + recursion(m, n-1, dp);
        }
        return dp[m][n];
    }

    // use 2d array for dp solution

}
