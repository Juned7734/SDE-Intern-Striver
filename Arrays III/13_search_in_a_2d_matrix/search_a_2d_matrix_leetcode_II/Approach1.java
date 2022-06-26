class Solution {

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
    for (int i = 0; i < matrix.length; i++) {
      if (binarySearch(matrix[i], 0, matrix[0].length - 1, target)) {
        return true;
      }
    }

    return false;
  }
}
