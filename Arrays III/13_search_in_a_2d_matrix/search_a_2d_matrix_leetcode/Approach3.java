class Solution {

  // In this approach we are considering a whole matrix as
  // a linear array and then we are applying binary search on it
  public boolean binarySearch(int[][] arr, int start, int end, int target) {
    if (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid / arr[0].length][mid % arr[0].length] == target) return true;
      if (
        target < arr[mid / arr[0].length][mid % arr[0].length]
      ) return binarySearch(
        arr,
        start,
        mid - 1,
        target
      ); else return binarySearch(arr, mid + 1, end, target);
    }
    return false;
  }

  public boolean searchMatrix(int[][] matrix, int target) {
    return binarySearch(
      matrix,
      0,
      matrix.length * matrix[0].length - 1,
      target
    );
  }
}
