// Time Complexity : exponential
// Space Complexity : O(1)
class Solution {

  public int uniquePaths(int m, int n) {
    if (n == 1 && m == 1) {
      return 1;
    }

    if (n < 1 || m < 1) {
      return 0;
    }

    return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
  }
}
