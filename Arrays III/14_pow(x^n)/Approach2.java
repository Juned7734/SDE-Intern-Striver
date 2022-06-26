// Time Complexity: O(logN)
// Space Complexity: O(1)
class Solution {

  public double pow(int x, int n) {
    long nn = Math.abs(n);
    double ans = 1;

    while (nn > 0) {
      if (nn % 2 == 0) {
        x = x * x;
        nn /= 2;
      } else {
        ans = ans * x;
        nn -= 1;
      }
    }
    if (n < 0) return 1 / ans;
    return ans;
  }
}
