class Solution {

  //     Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

  // Integers in each row are sorted from left to right.
  // The first integer of each row is greater than the last integer of the previous row.
  // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
  // Output: true
  // [1 , 3, 5, 7]
  // [10,11,16,20]
  // [23,30,34,60]

  public boolean binarySearch(int[] arr, int start, int end, int target) {
    if (start <= end) {
      int mid = start + (end - start) / 2;

      if (target == arr[mid]) {
        return true;
      }

      if (target < arr[mid]) {
        return binarySearch(arr, start, mid - 1, target);
      } else {
        return binarySearch(arr, mid + 1, end, target);
      }
    }
    return false;
  }

  public boolean searchMatrix(int[][] matrix, int target) {
    for (int i = 1; i < matrix.length; i++) {
      if (target < matrix[i][0]) {
        return binarySearch(matrix[i - 1], 0, matrix[0].length - 1, target);
      }
    }

    return binarySearch(
      matrix[matrix.length - 1],
      0,
      matrix[0].length - 1,
      target
    );
  }
}
