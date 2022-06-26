class Solution {
  public static void merge(long arr1[], long arr2[], int n, int m) {
    // code here
    // Input:
    // n = 4, arr1[] = [1 3 5 7]
    // m = 5, arr2[] = [0 2 6 8 9]
    // Output:
    // arr1[] = [0 1 2 3]
    // arr2[] = [5 6 7 8 9]
    // Explanation:
    // After merging the two
    // non-decreasing arrays, we get,
    // 0 1 2 3 5 6 7 8 9.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr1[i] > arr2[j]) {
          swap(arr1, arr2, i, j);
          // Arrays.sort(arr2);
          for (int k = j; k < m - 1; k++) {
            if (arr2[k] > arr2[k + 1]) swap(arr2, arr2, k, k + 1); else break;
          }
        }
      }
    }
  }

  public static void swap(long[] arr1, long arr2[], int i, int j) {
    long temp = arr1[i];
    arr1[i] = arr2[j];
    arr2[j] = temp;
  }
}
