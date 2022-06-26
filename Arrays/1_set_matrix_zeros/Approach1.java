class Solution {

  public void setZeroes(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          // matrix[i][j]
          setRow(matrix, i, j);
          setColumn(matrix, i, j);
        }
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == -11111) {
          matrix[i][j] = 0;
                }
      }
    }
  }

  public static void setRow(int[][] matrix, int row, int col) {
    for (int i = 0; i < matrix[0].length; i++) {
      if (matrix[row][i] != 0) matrix[row][i] = -1;
    }
  }

  public static void setColumn(int[][] matrix, int row, int col) {
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][col] != 0) matrix[i][col] = -1;
    }
  }
}
