class Solution {

  public boolean searchMatrix(int[][] matrix, int target) {
    int i = 0;
    int n = matrix.length;
    int j = matrix[0].length - 1;

    while (i < n && j > -1) {
      if (matrix[i][j] == target) {
        return true;
      }
      if (target < matrix[i][j]) {
        j--;
      } else {
        i++;
      }
    }
    return false;
  }
}
