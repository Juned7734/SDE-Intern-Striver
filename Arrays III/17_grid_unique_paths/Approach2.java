// Time Complexity : O(M*N);
// Space Complexity : O(M*N);
class Solution {

  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 0; i < m + 1; i++) {
      for (int j = 0; j < n + 1; j++) {
        dp[i][j] = -1;
      }
    }

    return path(m - 1, n - 1, dp);
  }

  public int path(int m, int n, int[][] dp) {
    if (m == 0 || n == 0) {
      return 1;
    }

    if (dp[m][n] != -1) {
      return dp[m][n];
    }

    if (m < 0 || n < 0) {
      dp[m][n] = 0;
      return 0;
    }

    int path = path(m - 1, n, dp) + path(m, n - 1, dp);
    dp[m][n] = path;
    return path;
  }
}
