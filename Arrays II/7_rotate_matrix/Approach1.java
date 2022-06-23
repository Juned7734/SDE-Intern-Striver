public class Approach1 {

  public void rotate(int[][] matrix) {
    int n = matrix.length;
    int[][] newMat = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        newMat[j][n - i - 1] = matrix[i][j];
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = newMat[i][j];
      }
    }
  }
}
