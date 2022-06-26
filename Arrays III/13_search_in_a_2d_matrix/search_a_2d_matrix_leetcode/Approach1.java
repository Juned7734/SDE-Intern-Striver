class Solution {

  //     Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

  // Integers in each row are sorted from left to right.
  // The first integer of each row is greater than the last integer of the previous row.
  // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
  // Output: true
  // [1 , 3, 5, 7]
  // [10,11,16,20]
  // [23,30,34,60]

  public boolean searchMatrix(int[][] matrix, int target) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length[0]; j++) {
        if (matrix[i][j] == target) return true;
      }
    }
    return false;
  }
}
